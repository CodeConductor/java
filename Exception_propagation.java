package com.cap.exception_example;

public class Exception_propagation {
	//String name="";
	void m()
    {
        int data = 50/0; // unchecked exception occurred 
        // exception propagated to n()
    }
 
    void n()
    {
        m();
        // exception propagated to p()
    }
 
    void p()
    {
        try {
            n(); // exception handled
        }
        catch(ArithmeticException e) {
            System.out.println ("Can't divide a number by 0");
            
        }
        catch (Exception e) {
            System.out.println("Exception handled");
        }
    }
 
    public static void main(String args[])
    {
    	Exception_propagation obj = new Exception_propagation();
        obj.p();
        System.out.println("Normal flow...");
        //cplcm ===> white box test design techniques 
        
        // mutation testing ====> 
    }
}


