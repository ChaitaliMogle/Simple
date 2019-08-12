package com.java.selenium.automation.Simple;

import java.util.Scanner;

public class sorting {

	public static void main(String[] args) {
		int n, temp;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no. of elements you want in array");
		n=sc.nextInt();
		int a[]=  new int[n];
		System.out.println("enter all the elements :");
		for(int i= 0; i<n; i++)
		{
			a[i]= sc.nextInt();
		}
	
	}

}
