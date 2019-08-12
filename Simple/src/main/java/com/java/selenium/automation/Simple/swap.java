package com.java.selenium.automation.Simple;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		
		System.out.println("Enter value of x and y");
		
		Scanner sc= new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println("Before Swapping:" +x+" "+y);
		
		//swapping
		
		x=x+y;//10+20=30
		y=x-y;//30-20=10
		x=x-y;//30-10=20
		
		System.out.println("After Swapping:"+x+" "+y);
		
		
		
		
	}

}
