package org.strg;
import java.util.Scanner;
public class Stringverifythenreplaceit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("***********enter mail address***********");
		String s=sc.next();
		System.out.println();
		if(s.contains("gmail")) {
			System.out.println( "**********entered id is valid****************** ");
			System.out.println();
			System.out.println("*******replace gmail into yahoo**********");
			System.out.println();
		       System.out.println("     "+s.replaceAll("gmail", "yahoo"));
		}
		else
		{
		System.out.println("****************invalid mail address*******************");	
		}
	
	}

}
