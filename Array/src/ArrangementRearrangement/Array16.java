package ArrangementRearrangement;
import java.util.*;

public class Array16 {
	public static void main(String []args) {
		int []arr = {2, 0, 1, 4, 5, 3 };
		int length = arr.length;
		Array16 array = new Array16();
		array.arrangearray(arr,length);
		System.out.println(Arrays.toString(arr));
	}
	
	public void arrangearray(int[] arr,int length) {
		int temp;
		for(int i=0;i<length;i++) {
			temp = arr[i];
			arr[i] = arr[arr[i]];
			arr[arr[i]] = temp;
		}
	}
}
