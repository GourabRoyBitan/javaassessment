//Create a class CustomerManagement that will 
//use a LinkedList to store Customer objects(cust_id,name,product & price) 
//and the Scanner class to interact with the user.
package com.acc.lkm.day3;
import java.util.*;
class Customer{
	int custId;
	int price;
	String custName;
	String product;
	Customer(String details){
		String str[]=details.split(" ");
		custId=Integer.parseInt(str[0]);
		price=Integer.parseInt(str[1]);
		custName=str[2];
		product=str[3];
		
	}
}

public class CustomerManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList <Customer>ll=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		ll.add(new Customer(str));
		for(Customer c:ll) {
			System.out.println(c.custId);
			System.out.println(c.price);
			System.out.println(c.custName);
			System.out.println(c.product);
			
		}
		

	}

}
