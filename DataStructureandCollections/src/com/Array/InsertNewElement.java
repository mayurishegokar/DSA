package com.Array;

public class InsertNewElement {

	public static void main(String[] args) {
	
		int[] arr= {10,20,30,40,50,60};
		int[] newArr=new int[arr.length+1];
		int element=35;
		int index=3;
		
		for(int i=0;i<index;i++)
		{
			newArr[i]=arr[i];
		}
		newArr[index]=element;
		
		for(int i=index;i<newArr.length-1;i++)
		{
			newArr[i+1]=arr[i];
		}
		
		for(int array:newArr)
		{
			System.out.print(array+" ");
		}
		
	}

}
