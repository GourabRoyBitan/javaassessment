package com.acc.lkm.day3;
import java.util.Scanner;
class underAgeException extends Exception{
	underAgeException(String msg){
		System.out.println(msg);
	}
}

public class ThrowDemo {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		try {
			vote(age);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	
	}
	public static void vote(int age) throws underAgeException {
		if(age<18) {
			throw new underAgeException("Candidate is under age");
		}else {
			System.out.println("candidate is eligible for vote");
		}
	}
}
