package com.cap.exception_example;

class StringIndexOutOfBound_Demo
{
    public static void main(String args[]) throws InterruptedException 
    {
        try {
            String a = "This"; 
            int b =a.length();//4
            Thread.sleep(2000);
            System.out.println(b);//4
            char c = a.charAt(4);// accessing 50th element
            //int b =a.length();
           
            System.out.println(c);//s
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("enjoy string out of bound exceptions ");
        }
        System.out.println("enjoy your holiday in goa "); 
        System.out.println("enjoy your holiday in pune "); 
        System.out.println("enjoy your holiday in andaman "); 
    }
}

