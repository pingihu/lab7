package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] unsortedArray) {
		for (int i = 0; i < unsortedArray.length; i++) {
		  int j = i;
		  while (j > 0 && unsortedArray[j - 1] > unsortedArray[j]) {
		    int temp = unsortedArray[j];
		    unsortedArray[j] = unsortedArray[j - 1];
		    unsortedArray[j - 1] = temp;
		    j = j - 1;
		  }
		}
		return unsortedArray;
	}
}
