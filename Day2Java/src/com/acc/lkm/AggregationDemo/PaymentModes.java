package com.acc.lkm.AggregationDemo;
import java.util.*;

public class PaymentModes {
	public String process_payment(Date payment,String mode1,String mode2) {
		System.out.println(payment);
		String dt=String.valueOf(payment);
		return mode1+"\n"+mode2+"\n"+dt;
	}
	public String process_payment(Date payment,String mode1,String mode2,String mode3) {
		System.out.println(payment);
		String dt=String.valueOf(payment);
		return mode1+"\n"+mode2+"\n"+mode3+"\n"+dt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentModes pm=new PaymentModes();
		System.out.println(pm.process_payment(new Date(),"Credit Card","Debit Card"));
		System.out.println(pm.process_payment(new Date(),"Credit card","Debit card","UPI"));
		

	}

}
