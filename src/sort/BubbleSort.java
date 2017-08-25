package sort;

import java.util.Arrays;
/*bubble sort swap adjacent elements in order from left to right, So in each
iteration, we get sorted array at right most part.
We need to handle this with skippign rightmost sorted part.

Just remember : second for loop (j<arr.length-i-1) which skips sorted part

Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.

Best Case Time Complexity: O(n). Best case occurs when array is already sorted.

Auxiliary Space: O(1)

Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.
*/
/**
 * @author sachin4java@blogspot.com
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		 int arr[] = {64,25,12,22,11};
	        sort(arr);
	        System.out.println("Sorted array"+Arrays.toString(arr));

	}
	
	public static void sort(int[] arr){
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]){
					//swap
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
			
		}

	}

}
