package com.amol;

public class SelectionSort {
	
	public static int[] selectionSort(int[] arr) {
		
		for(int lastUnsortedIndex=arr.length-1;lastUnsortedIndex>0;lastUnsortedIndex--) {
			int largest=0;
			for(int i=1;i<=lastUnsortedIndex;i++) {
				if(arr[i]>arr[largest])
					largest=i;
			}
			 swap(arr,largest,lastUnsortedIndex);
		}
		return arr;
	}

	private static void swap(int[] arr, int largest, int lastUnsortedIndex) {
		int temp=arr[lastUnsortedIndex];
		arr[lastUnsortedIndex]=arr[largest];
		arr[largest]=temp;
	}

	public static void main(String[] args) {

		int[] temp=selectionSort(new int[] {20,35,-15,7,55,1,-22});
		for (int i : temp) {
			System.out.println(i);
		}
	}

}
