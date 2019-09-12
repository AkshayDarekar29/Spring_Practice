package com;

public class Student {
	private int id;
	private String name;
	
	public Student(){
		
	}
	public Student(String i){
		System.out.println("Strin");
	}
	private Student(int i){
		System.out.println("int constructor");
	}
	
	public Student(String i, String j){
		System.out.println("Student(String i, String j)");
	}
	public Student(int i, String j){
		System.out.println("Student(int i, String j)");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
