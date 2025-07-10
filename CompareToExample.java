package com.cap.exception_example;

public class CompareToExample{
public static void main(String args[]){
String s1="a"; // literal A ===> 65 a ==> 65+32 =97 
String s2="hello";// literal
String s3="meklo";
String s4="hemlo";
String s5="flag";
System.out.println(s1.compareTo(s2));//0 because both are equal
//System.out.println(s3.compareTo(s1));//-5 because "h" is 5 times lower than "m"
//System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"
//System.out.println(s5.compareTo(s1));//2 because "h" is 2 times greater than "f"
}}