package ArrangementRearrangement;
import java.util.Arrays;

public class Array23 {
	public static void main(String []args) {
		int []arr = {2, 3, 4, 5, 6 };
		int length = arr.length;
		Array23 array = new Array23();
		array.modify(arr,length);
		System.out.println(Arrays.toString(arr));
		
		
	}
	public void modify(int []arr,int length) {
		int prev = arr[0];
		arr[0] = arr[1]*arr[0];
		for(int i=1;i<length-1;i++) {
			int curr = arr[i];
			arr[i] = prev*arr[i+1];
			prev = curr;
		}
		arr[length-1] = prev*arr[length-1];
		
	}
	
}
