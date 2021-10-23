package org.strg;
public class Smallletterintocapital {
	public static void main(String[] args) {
		String s="MuthuRAj";
	StringBuffer  st=new StringBuffer(s);
	for(int i=0;i<s.length();i++) {
		//checks for lower case character
	    if(Character.isLowerCase(s.charAt(i))) 
	    {    
	    	//convert that character to uppercase() using function
		st.setCharAt(i, Character.toUpperCase(s.charAt(i)));	
		}//checks for upper case
	    else if(Character.isUpperCase(s.charAt(i)))
	    {//convert that into lower case() using function
	    	st.setCharAt(i,Character.toLowerCase(s.charAt(i)));
	    }
	}
System.out.println("small letter into capital letter =  "+s+  "    to   "  +st);
}
}