package search;

/**
 * @author sachin4java@blogspot.com
 *
 */
public class BinarySearch {

	public static void main(String[] args) {
		 int arr[] = {2,3,4,10,40};
	        int n = arr.length;
	        int x = 10;
	      //*******Recursive approach************************
	        System.out.println("*******Recursive approach************************");
	        int result = binarySearchRecursive(arr,0,n-1,x);
	        if (result == -1)
	            System.out.println("Element not present");
	        else
	            System.out.println("Element found at index "+result);
	        
	        //*******Ietrative approach************************
	        System.out.println("*******Ietrative approach************************");
	        int result1 = binarySearchIterative(arr, x);
	        if (result1 == -1)
	            System.out.println("Element not present");
	        else
	            System.out.println("Element found at index "+result1);
		
	}
	
	//*******Recursive approach************************
	  static int binarySearchRecursive(int arr[], int start, int end, int x)
	    {
	        if (end>=start)
	        {
	            int mid = start + (end - start)/2;
	 
	            // If the element is present at the middle itself
	            if (arr[mid] == x)
	               return mid;
	 
	            // If element is smaller than mid, then it can only
	            // be present in left subarray
	            if (arr[mid] > x)
	               return binarySearchRecursive(arr, start, mid-1, x);
	 
	            // Else the element can only be present in right
	            // subarray
	            return binarySearchRecursive(arr, mid+1, end, x);
	        }
	 
	        // We reach here when element is not present in array
	        return -1;
	    }
	 //*******Iterative approach************************
	 // Returns index of x if it is present in arr[], else
	    // return -1
	     static int binarySearchIterative(int arr[], int x)
	    {
	        int start = 0, end = arr.length - 1;
	        while (start <= end)
	        {
	            int m = start + (end-start)/2;
	 
	            // Check if x is present at mid
	            if (arr[m] == x)
	                return m;
	 
	            // If x greater, ignore left half
	            if (arr[m] < x)
	                start = m + 1;
	 
	            // If x is smaller, ignore right half
	            else
	                end = m - 1;
	        }
	 
	        // if we reach here, then element was not present
	        return -1;
	    }

}
