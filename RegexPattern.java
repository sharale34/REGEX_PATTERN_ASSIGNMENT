package com.BridgeLabz.Regex;
import java.util.Scanner;
import java.util.regex.*;
public class RegexPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the PIN Code :");
    String pin = sc.nextLine();
    String pattern ="[1-9][0-9]{5}";
    Pattern p = Pattern.compile(pattern);
    Matcher m = p.matcher(pin);
    if(m.matches())
    {
    	System.out.println("PIN Code is validated");
    }
    else
    {
    	System.out.println("PIN Code is not validated");
    }
	}
}
