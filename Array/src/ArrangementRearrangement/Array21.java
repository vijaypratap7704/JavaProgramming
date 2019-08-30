package ArrangementRearrangement;

import java.util.Arrays;

public class Array21 {
	public static void main(String []args) {
		int []arr = { 6, 4, 2, 1, 8, 3};
		int length = arr.length;
		Array21 array = new Array21();
		array.arrange(arr, length);
		System.out.println(Arrays.toString(arr));
	}
	public void arrange(int []arr, int length) {
		int temp;
		for(int i=0;i<length-2;i++) {
			if(i%2==0) {
				if(arr[i] >arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			if(i%2!=0) {	
				if(arr[i] < arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}	
			}
		}
	}
}
}