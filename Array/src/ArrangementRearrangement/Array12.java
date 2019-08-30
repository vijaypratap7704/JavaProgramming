package ArrangementRearrangement;
import java.util.Arrays;
public class Array12 {
	public static void main(String []args){
		int []arr = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8};
		int length = arr.length;
		Array12 array = new Array12();
		array.arrange(arr, length);
		System.out.println(Arrays.toString(arr));
	}
	public void arrange(int[] arr,int length) {
		for(int i=0;i<length-1;i++) {
			if(arr[i]==arr[i+1]) {
				arr[i] = 2*arr[i];
				arr[i+1] = 0;
			}	
		}
		int temp;
		int n = -1;
		for(int j=1;j<length;j++) {
			if(arr[j] != 0) {
				n++;
				temp = arr[n];
				arr[n] = arr[j];
				arr[j] = temp;
			}
		}
	}
}
