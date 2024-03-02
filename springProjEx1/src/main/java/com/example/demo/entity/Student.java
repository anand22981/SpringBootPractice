package com.example.demo.entity;

public class Student 
{
String kId;
String name;
int age;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(String kId, String name, int age) {
	super();
	this.kId = kId;
	this.name = name;
	this.age = age;
}
public String getkId() {
	return kId;
}
public void setkId(String kId) {
	this.kId = kId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Student [kId=" + kId + ", name=" + name + ", age=" + age + "]";
}












}
