package ArrangementRearrangement;
import java.util.Arrays;

public class Array1 {
	public static void main(String []args) {
		int []arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
		int length = arr.length;
		Array1 array= new Array1();
		array.arrayoperation(arr, length);
		System.out.println(Arrays.toString(arr));
	}
	public void arrayoperation(int []arr,int length) {
		for(int i=0;i < length;i++) {
			if(arr[i]>=0 &&  arr[i]!= i) {
				int element = arr[arr[i]];
				arr[arr[i]] = arr[i];
				arr[i] = element;
			}
		}
	}
}