package com.cap.exception_example;

class ArrayIndexOutOfBound_Demo
{
    public static void main(String args[])
    {
    	int a[] = new int[5]; // fixed covid 19 max 50 ===> 50 chair 
        try{
        	//int a[] = new int[50];
            a[0]=5;
            a[1]=6;
            int b=20;
            int c =5;
         
            int a1 =b/c; // arithmatic exception 
            System.out.println(" i m here ===> "+a1 );
            a[4] = 99;
           a[5]=10; //help
            // accessing 6th element in an array of
                      // size 5
            
            System.out.println("i m here ====> " + a[0]);
        }
        catch(ArrayIndexOutOfBoundsException e){
           System.out.println ("Array Index is Out Of Bounds");
        }
        catch(ArithmeticException e) {
            System.out.println ("Can't divide a number by 0 swamy ");
            
        }
        
        System.out.println("i m here ====> " + a[0]);
        System.out.println("i m here a{4} ====> " + a[4]);
        a[3] = 9; 
        System.out.println("i m here a[2] ====> " + a[2]);
        
    }
}
