package org.strg;
//import java.util.Scanner;
public class Countofdifferentstrings {
	public static void main(String[] args) {
	//	Scanner s=new Scanner(System.in);
		//System.out.println("**enter the different strings**");
	//String st=s.next();
String st="Welcome To Java class @123";
		int upper = 0,lower=0,number=0,special=0,i;
	for(i=0;i<st.length();i++) {
	if(st.charAt(i)>='A'&&st.charAt(i)<='Z') {
		upper++;
	}
	else if(st.charAt(i)>='a'&&st.charAt(i)<='z'){
		lower++;
	}
	else if(st.charAt(i)>='0'&&st.charAt(i)<='9') {
		number++;
	}
	else {
		special++;
	}
	}
	System.out.println("upper string = "+upper);
	System.out.println("lower string = "+lower);
	System.out.println("number string= "+number);
	System.out.println("special string= "+special);
	}
}
