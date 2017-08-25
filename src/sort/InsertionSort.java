package sort;

import java.util.Arrays;

/*Insertion sort is to take  insert index point(here we have taken 1) and then check this index element 
with all elements from left side to find the insert position.

In each iteration, we get the fixed position of the element
*/
public class InsertionSort {

		public static void main(String[] args) {
			
	        int arr[] = {64,25,12,22,11};
	        sort(arr);
	        System.out.println("Sorted array"+Arrays.toString(arr));

	}
	
	public static void sort(int[] arr){
		
		for (int i = 1; i < arr.length; i++) {
			int index = arr[i];
			int j=i-1;  //for going index right to left element position
			
			while(j>=0 && arr[j]>index){
				arr[j+1]=arr[j];//move element postion by one to make space for index element
				j=j-1;
			}
			
			arr[j+1]=index; //add the index element at this position
			
		}
	}

}

/*Happy coding :)*/
