package search;

/**
 * @author Sachin Rane(sachin4java.blogspot.com)
 *
 */
public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0]=5;
		arr[1]=8;
		arr[2]=8;
		arr[3]=2;
		arr[4]=4;
		
		int x=2;
		int element = search(arr, x);  
		System.out.println("element-->"+element);
	}
	
    static int search(int arr[], int x)
    {
        for (int i = 0; i < arr.length; i++)
        {
            // Return the index of the element if the element
            // is found
            if (arr[i] == x)
                return i;
        }
  
        // return -1 if the element is not found
        return -1;
    }

}
