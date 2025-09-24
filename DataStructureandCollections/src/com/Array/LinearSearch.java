package com.Array;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] arr= {10,15,20,25,30,35,40,45};
		int searchEelement=30;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==searchEelement)
			{
				System.out.println(searchEelement+" Element found at "+i+" index.");
			}
		}
	}

}
