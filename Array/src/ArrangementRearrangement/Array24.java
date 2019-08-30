package ArrangementRearrangement;
import java.util.Random;
import java.util.Arrays;

public class Array24 {
	public static void main(String []args) {
		int []arr = {1, 2, 3, 4, 5, 6, 7, 8};
		int length= arr.length;
		Array24 array = new Array24();
		array.shufflearray(arr,length);
		System.out.println(Arrays.toString(arr));
	}
	public void shufflearray(int []arr, int length) {
		Random r = new Random();
		for(int i=length-1;i>0;i--) {
			int j = r.nextInt(i+1);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
}
