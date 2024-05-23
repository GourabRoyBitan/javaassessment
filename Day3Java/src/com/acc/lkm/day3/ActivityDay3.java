package com.acc.lkm.day3;
import java.util.*;
class Employee{
	static int empId;
	static String empName;
	static String location;
	Employee(int empId,String empName,String location) {
		this.empId=empId;
		this.empName=empName;
		this.location=location;
	}
	
}

public class ActivityDay3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList <Employee> arr=new ArrayList<>();
		
		for(Employee a:arr) {
			System.out.println(a.empId);
			System.out.println(a.empName);
			System.out.println(a.location);
		}
		
		
		

	}

}
