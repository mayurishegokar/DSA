package com.Array;

import java.util.Scanner;

public class DeleteElement {
	
	public static void main(String[] args) {
		
		int[] arr= {10,15,20,25,30,35,40,45};
		int[] newArr=new int[arr.length-1];
		int delement=25;
		
		int j=0;
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]==delement)
			{
			 	continue;	
			}
			newArr[j]=arr[i];
			j++;
			
			
		}
		System.out.println("Delete "+delement+" in the Array");
		for(int array:newArr)
		{
			System.out.print(array+" ");
		}
	}

}
