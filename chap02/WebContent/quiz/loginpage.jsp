<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
   
<%@ page import="java.sql.Connection" %>  
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>  

<%@ page import="java.security.MessageDigest" %> 
<%@ page import="java.security.NoSuchAlgorithmException" %> 


    
<%@ page import="com.zaxxer.hikari.HikariConfig" %>
<%@ page import="com.zaxxer.hikari.HikariDataSource" %>
<%
		Class.forName("oracle.jdbc.driver.OracleDriver");
		HikariConfig hikari_config = new HikariConfig();

		
		hikari_config.setJdbcUrl("jdbc:oracle:thin:@localhost:1521/XEPDB1");
		hikari_config.setUsername("java1");
		hikari_config.setPassword("1234");
		hikari_config.addDataSourceProperty("cachePrepStmts", "true");
		hikari_config.addDataSourceProperty("prepStmtCacheSize", "250");
		hikari_config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
		HikariDataSource ds = new HikariDataSource(hikari_config);
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		String has_pass = sha256(password);
		System.out.println(has_pass);
		
		
		session.setMaxInactiveInterval(10);  
		
		String sql = "SELECT * FROM user_informations WHERE user_id=? AND user_password=?";
		String sql_id = null;
		String sql_password = null;
		String sql_email = null;
		
		try (
				Connection conn = ds.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
			
		){
			pstmt.setString(1, id);
			pstmt.setString(2, has_pass);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				sql_id = rs.getString(1);
				sql_password = rs.getString(2);
				sql_email = rs.getString(3);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	
	if(sql_password == null) {
		response.sendRedirect("/chap02/quiz/login.jsp");
	} else {
	
	session.setAttribute("user_info", id);
	session.setAttribute("user_id", sql_id);
	session.setAttribute("user_password", sql_password);
	session.setAttribute("user_email", sql_email);
	
	response.sendRedirect("/chap02/quiz/login.jsp");
	}
%>

<%! 

	

	public static String sha256(String msg) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(msg.getBytes());
		        
	return bytesToHex1(md.digest());
	}
%>

<%!
	public static String bytesToHex1(byte[] bytes) {
    	StringBuilder builder = new StringBuilder();
    	for (byte b: bytes) {
    	 builder.append(String.format("%02x", b));
    	}
    	return builder.toString();
	}

%>
