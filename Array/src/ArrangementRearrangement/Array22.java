package ArrangementRearrangement;
import java.util.Arrays;

public class Array22 {
	public static void main(String []args) {
		int []arr = {-1, 3, -5, 6, 3, 6, -7, -4, -9, 10 };
		int length = arr.length;
		Array22 array = new Array22();
		array.arrange_positive_negative(arr, length);
		System.out.println(Arrays.toString(arr));
	}
	public void arrange_positive_negative(int []arr,int length) {
		int p= 0;
		int n = 1;
		int temp;
		while(true) {
			while(p<length && arr[p]>=0)
				p+=2;
			while(n<length && arr[n]<=0)
				n+=2;
			if(p<length && n<length) {
				temp = arr[p];
				arr[p] = arr[n];
				arr[n] = temp;	
			}
			else
				break;
		}
	}
}
