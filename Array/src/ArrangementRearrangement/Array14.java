package ArrangementRearrangement;
import java.util.Arrays;

public class Array14 {
	public static void main(String []args) {
		int []arr = { 12, 11, -13, -5, 6, -7, 5, -3, -6 };
		int length = arr.length;
		Array14 array = new Array14();
		array.arrangebyinsertion(arr, length);
		System.out.println(Arrays.toString(arr));
	}
	public void arrangebyinsertion(int []arr,int length) {
		int i=-1;
		int temp;
		for(int j=0;j<length;j++) {
			if(arr[j]<=0) {
				i++;
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
	}
	
	
}
