package com.Array;

import java.util.Scanner;

public class InsertElement {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array size.");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		System.out.println("Enter Array Element");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array Element are");
		for(int array:arr)
		{
			System.out.print(array+" ");
		}
		
		sc.close();
	}

}
