package com.amol;

public class BubbleSortDemo {

	public static int[] bubbleSort(int[] arr) {
		for (int i = arr.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j]==arr[j+1])
					continue;
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	public static int[] optimizedBubbleSort(int arr[]) {
		int i,j,temp,n=arr.length;
		boolean swapped;
		for(i=0;i<n-1;i++) {
			swapped=false;
			for(j=0;j<n-i-1;j++) {
				if (arr[j] > arr[j + 1]) 
                {
                    // swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
			}
			if (swapped == false)
                break;
		}
		return arr;
		
	}
	public static void main(String[] args) {
		int[] temp=optimizedBubbleSort(new int[]{20,35,15,55,7,-22});
		for (int i : temp) {
			System.out.println(i);
		}
	}

}
