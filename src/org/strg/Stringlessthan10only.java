package org.strg;
import java.util.Scanner;
public class Stringlessthan10only {
public static void main(String[] args) {
	Scanner c=new Scanner(System.in);
	System.out.println("**enter phone number**");
  String s=c.next();
  if(s.length()>10) {
	  System.out.println("**invalid number**");
  }
  else
  {
	  System.out.println("**valid number**");
  }

}
}
