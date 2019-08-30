package ArrangementRearrangement;

import java.util.Arrays;

public class Array3 {
	public static void main(String []args) {
		int []arr = new int[] {4,2,7,5,87,90,21};
		int length = arr.length;
		Array3 array = new Array3();
		array.arrangearray(arr, length);
		System.out.println(Arrays.toString(arr));
		
	}
	public void arrangearray(int []arr , int length) {
		int []arr1 = new int[arr.length];
		for(int i=0;i<length;i++) {
			arr1[i] = arr[i];
		}
		Arrays.sort(arr1);
		for(int j = length/2,k=0;j>=0;j--,k=k+2) {
			arr[k] = arr1[j]; 
		}
		for(int n = length/2+1, m=1;n<length;n++,m=m+2) {
			arr[m] = arr1[n]; 
		}
	}
 
}
