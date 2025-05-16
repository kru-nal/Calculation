package com.addition;

public class OperatorDemo {
	
	public static void main(String []args) { 
	// logical And operator demo &&
	int a =5;
	int b =10;
	int c =8;
    int d = 50;
	
	System.out.println((a<b) && (b>c) ); // true 
	System.out.println((a>c &&   c<b)); // false
	System.out.println((a>d &&   c<b)); // false
	   }

    }
