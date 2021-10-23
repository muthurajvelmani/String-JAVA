package org.strg;
import java.util.Scanner;
public class Stringverifythenreplaceit1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("***********enter the address***********");
		String s=sc.next();
		System.out.println();
		if(s.contains("pincode")) {
			System.out.println( "**********address is valid****************** ");
			System.out.println();
			System.out.println("*******replace pincode into emptyspace**********");
			System.out.println();
		       System.out.println("     "+s.replaceAll("pincode", "   "));
		}
		else
		{
		System.out.println("****************invalid  address*******************");	
		}
	}
	

}
