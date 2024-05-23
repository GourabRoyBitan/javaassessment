package com.acc.lkm.day3;


public class ArrayOutOfBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int x=100;
		int y=x/2;
		System.out.println(y);
		//int a[]= new int[10];
		//a[20]=400;
		//String str="Accenture";
		//Integer num=Integer.valueOf(str);
		String st=null;
		System.out.println(st.length());
		/*for (int i=0;i<9;i++) {
			System.out.println(a[i]);
		}*/
		}catch(ArithmeticException e){
			System.out.println("arithException is handled");
			
		}catch(NullPointerException e){
			System.out.println("nullpointer exception");
			
		}
		catch(Exception e){//Exception is the parent class of all exception classes.
			System.out.println("Exception is handled");
			
		}
		finally{
			System.out.println("Always excecuted");
		}
		
	
		
		
	}

}
