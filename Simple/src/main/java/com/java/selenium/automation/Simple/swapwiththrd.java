package com.java.selenium.automation.Simple;

import java.util.Scanner;

public class swapwiththrd {

	public static void main(String[] args) {
		
		System.out.println("Enter value of x and y ");
		Scanner sc= new Scanner(System.in);
		int x= sc.nextInt();
		int y= sc.nextInt();
		 
		System.out.println("Before Swapping" + x +" " +y);
		//swapping
		
		int temp=x;
		x=y;
		y=temp;
		 System.out.println("after swapping:" +x+""+y);
		
		
		
	}

}
