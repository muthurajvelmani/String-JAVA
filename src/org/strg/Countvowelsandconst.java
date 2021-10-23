package org.strg;
import java.util.Scanner;
public class Countvowelsandconst {
	public static void main(String[] args) {
	int vowels=0,constant=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("********enter the string******");
	String s=sc.next();
	s=s.toUpperCase();
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
			vowels++;	
		}
		else if(s.charAt(i)>='A'&&s.charAt(i)<='Z') {
			constant++;
		}
		
	}
System.out.println("vowels "+vowels);
	System.out.println("constant"+constant);
	
	
	}

}
