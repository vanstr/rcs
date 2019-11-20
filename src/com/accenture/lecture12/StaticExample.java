package com.accenture.lecture12;


class Student{
	String name;
	static String school = "BankuAugstSkola"; 
	
	public void getUserInfo(){
		System.out.println("Name " + name);
	}
	
	public static void whatIsYourSchool(){
		System.out.println("I'm not student yet");
	}
	
	public static int sum(int arg1, int arg2){		
		return arg1 + arg2;
	}
}

public class StaticExample {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for(String arg : args){
			System.out.println(arg);
		}
		
		
		// TODO Auto-generated method stub
		Student student = new Student();
				
//		System.out.println(Student.name);
		System.out.println(Student.school);
		
		System.out.println(Student.sum(1, 2));
		
	}

}
