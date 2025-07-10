package com.cap.exception_example;

class ArithmeticException_Demo
{
	
    public static void main(String args[])
    {
       try {
            double a = 0;
            		int b = 0;
            double  c = a/b;  // cannot divide by zero
            System.out.println ("Result = " + c);
       }
        catch(ArithmeticException e) {
           System.out.println ("Can't divide a number by 0 Sahil ");
            
        }
        System.out.println(" hello anand");
        System.out.println(" hello krupa ");
     
    }
    
}

