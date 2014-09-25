import java.awt.RenderingHints.Key;
import java.util.Arrays;
import java.util.Collections;

import javax.naming.BinaryRefAddr;
import javax.sound.midi.MidiChannel;

public class Solution48 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 11, 10, 9, 8, 7, 6, 5, 4, 16, 15, 14, 13, 12 };

		int n = findEle(arr, 0, arr.length - 1, 15);
		System.out.println(n);
	}

	private static int findEle(int[] arr, int left, int right, int value) {

		while (left <= right) {
			int middle = (left + right) / 2;
			if (arr[middle] == value) {
				return middle;
			} else if (arr[middle] <= arr[left]) {
				if (value <= arr[middle]) {
					return Arrays.binarySearch(arr, left, middle, value);
				} else if (value > arr[middle] && value > arr[right]) {
					return findEle(arr, middle, right, value);
				} else {
					return Arrays.binarySearch(arr, left, middle, value);
				}

			} else {
				if (value >= arr[middle]) {
					return findEle(arr, left, middle, value);
					
				} else if(value < arr[middle] && value > arr[right]) {
					return Arrays.binarySearch(arr, middle, right, value);
					
				}else{
					return findEle(arr, left, middle, value);
				}
			}
		}

		return 0;
	}

}
