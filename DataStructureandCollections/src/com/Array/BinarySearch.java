package com.Array;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr= {10,12,14,16,18,20,22,24,26,28,30};
		int start=0;
		int end=arr.length-1;
		int element=38;
		int mid=0;
		boolean found=false;
		
		while(start<end)
		{
			
			mid=(start+end)/2;
			
			if(arr[mid]==element)
			{
				System.out.println(element+" element are found at "+mid+" index.");
				found=true;
				break;
			}
			
			else if(element>arr[mid])
			{
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		if(!found)
		{
			System.out.println("Element not found.....");
		}

	}

}
