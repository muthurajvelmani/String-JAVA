package org.strg;

import java.util.Scanner;

public class Countupperandlowercase {
	public static void main(String args[]){
		    String str;
		int upper=0,lower=0;
		 Scanner scan=new Scanner(System.in); 		    
		System.out.println("Enter the String  ");
		str=scan.nextLine();
		int i=0;
		while( i<str.length()){
		char ch=str.charAt(i);
		if(ch>='A' && ch<='Z'){
		    upper++;
		}
		else if(ch>='a' && ch<='z'){
		    lower++;
		}
		 i++;
		}
		System.out.println("lowercase letters: "+lower);
		System.out.println("uppercase letters: "+upper);
		}

















}





