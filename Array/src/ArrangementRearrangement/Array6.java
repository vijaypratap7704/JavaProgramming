package ArrangementRearrangement;
import java.util.Arrays;

public class Array6 {
	public static void main(String []args) {
		int []arr = new int[] {3,6,0,0,0,4,9,7,56};
		int length = arr.length;
		Array6 array = new Array6();
		array.rearrange(arr,length);
		System.out.println(Arrays.toString(arr));
	}
	public  void rearrange(int []arr, int length) {
		int temp;
		int i = -1;
		for(int j=0;j<length;j++) {
			if(arr[j] != 0) {
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
}
