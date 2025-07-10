package com.cap.exception_example;

public class Exception_demo_finally {
	public static void main(String args[]) {
		      int a[] = new int[2];// size will be two 
		     try {
		         System.out.println("Access element second===>  :" + a[2]);
		      } 
	catch (ArrayIndexOutOfBoundsException e) {
		         System.out.println("Exception thrown  :" + e);
		     }
		      finally {
		         a[0] = 6;
		         System.out.println("First element value: " + a[0]);
		         System.out.println("The finally statement is executed");
		      }
		   }
		}

