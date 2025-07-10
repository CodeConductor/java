package com.cap.exception_example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestMultipleCatchBlock{  
	public static void main(String args[]){  
		
		  File file_path = new File("E:\\businessrule.txt");
		  
          //try {
//				try {
//					FileReader fr = new FileReader(file);
//				} catch (FileNotFoundException e) {
//					// TODO Auto-generated catch block
//					 System.out.println("File does not exist in that location ");
//				}
		try{  
			FileReader fr = new FileReader(file_path);
			int a[]=new int[5];  // size will be 5 
			a[5]=30/0;//help 
			System.out.println("value ==> "+ a[4]);
		}
		
		catch(ArithmeticException e )
		{
			System.out.println("arithmatic exception succesfully handled  ");
			}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array index out of bound exp");
			}  
		
		catch(Exception e)
		{
			System.out.println("some other exception occured ");
			}
		
		////catch(ArithmeticException e ){System.out.println("task 2 completed");}
		
		System.out.println("rest of the code...");  
		
		System.out.println("pravin code ...");  
		
		System.out.println("naina code ...");  
	}  
}    



