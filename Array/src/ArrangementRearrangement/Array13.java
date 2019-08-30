package ArrangementRearrangement;
import java.util.Arrays;
//Reorder an array according to given indexes
public class Array13 {
	public static void main(String []args) {
		int []arr = {50, 40, 70, 60, 90};
		int []index = {3,  0,  4,  1,  2};		
		int length = arr.length;
		Array13 array = new Array13();
		array.reorder(arr, index, length);
		System.out.println(Arrays.toString(arr));
	}
	public void reorder(int[] arr,int []index, int length) {
		int temp;
		int temp1;
		for(int i=0;i<length;i++) {
			temp = arr[index[i]];
			temp1 = index[index[i]];
			arr[index[i]] = arr[i];
			index[index[i]] = index[i];
			arr[i] = temp;
			index[i] = temp1;
			
		}
	}
}

