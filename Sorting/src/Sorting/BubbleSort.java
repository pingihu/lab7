package Sorting;
public class BubbleSort {
	
	private static boolean isSorted(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		//TODO: S1 implements bubble sort
		int n = unsortedArray.length;
		boolean swapped = false;
		do {
		  swapped = false;
		  for (int i = 1; i < n; i++) {
		    if (unsortedArray[i - 1] > unsortedArray[i]) {
			    int temp = unsortedArray[i];
			    unsortedArray[i] = unsortedArray[i - 1];
			    unsortedArray[i - 1] = temp;
			    swapped = true;
		    }
		  }
		} while (!isSorted(unsortedArray));
		return unsortedArray;
	}
}
