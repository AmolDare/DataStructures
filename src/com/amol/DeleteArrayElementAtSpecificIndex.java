package com.amol;

import java.util.stream.IntStream;

public class DeleteArrayElementAtSpecificIndex {
	
	public static int[] removeElement(int[] arr,int index) {
		if(index<0||arr==null||index>arr.length) {
			return arr;
		}
		int[] temp=new int[arr.length-1];
		for(int i=0,j=0;i<arr.length;i++) {
			if(i==index) {
				continue;
			}
			temp[j++]=arr[i];
		}
		return temp;	
	}
	public static int[] removeElementJava8(int[] arr,int index) {
		if(index<0||arr==null||index>arr.length) {
			return arr;
		}
		return IntStream.range(0, arr.length)
				.filter(i->i!=index)
				.map(i->arr[i])
				.toArray();
	}
	

	public static void main(String[] args) {
		//method to remove element at specific index of an array
		int[] arr=removeElementJava8(new int[]{1,2,3,4,5},2);
		for (int i : arr) {
			System.out.println(i);
		}
		arr[1]=(Integer) null;

	}

}
