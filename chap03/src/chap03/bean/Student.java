package chap03.bean;

import java.util.ArrayList;
import java.util.Comparator;

public class Student {
	
	private final static ArrayList<Student> ALL_STUDENTS = new ArrayList<>();
	
	//필드의 접근제어자를 private으로 설정
	private String stu_id;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private double avg;
	
	//기본 생성자가 반드시 존재해야 함
	
	public Student() {
		ALL_STUDENTS.add(this);
	}
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		ALL_STUDENTS.add(this);
		update();
	}
	
	
	private void update() {
		avg = (kor + eng + math) / 3.0;
		ALL_STUDENTS.sort(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				int compare1 = Double.compare(o2.avg, o1.avg);
				
				return compare1 != 0 ? compare1 : o1.name.compareTo(o2.name);
			}
		});
	
	}
	
	//필드에 접근할 때는 getter/setter를 이용해야 함
	
	/*
	 	# Getter and Setter
	 		- 우클릭 -> Source -> Generate Getters and Setters
	 		- Getter : 해당 클래스의 필드값을 반환해주는 메서드
	 		- Setter : 해당 클래스의 필드에 값을 대입하는 메서드
	 		- 메서드명은 반드시 get/set + 필드명(첫 글자 대문자)로 지어야 한다
	 		- 메서드명이 규칙에 맞지 않으면 JSP의 편리한 기능을 이용할 수 없다.
	*/
	public String getStu_id() {
		return stu_id;
	}
	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
		
	}
	public void setKor(int kor) {
		this.kor = kor;
		update();
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
		update();
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
		update();
	}
	public double getAvg() {
		return avg;
	}
	public int getRank() {
		return ALL_STUDENTS.indexOf(this) + 1;
	}
	
	
	
	
}
