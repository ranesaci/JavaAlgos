package sort;

import java.util.Arrays;

/*The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.

1) The subarray which is already sorted.
2) Remaining subarray which is unsorted.

In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray.
*/
/**
 * @author sachin4java@blogspot.com
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		
	        int arr[] = {64,25,12,22,11};
	        sort(arr);
	        System.out.println("Sorted array"+Arrays.toString(arr));

	}
	
	public static void sort(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			
			int min_idx=i;
			//this whole iteration will find one minimum element and will put into sorted position
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[min_idx]){
					min_idx=j;
				}
			}
			//swap the minimum element
			int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
			
			
		}
	}

}
