package ArrangementRearrangement;
import java.util.Arrays;

public class Array18 {
	public static void main(String []args) {
		int []arr = {1, 2, 3, 4, 5, 6, 7 };
		int length = arr.length;
		Array18 array = new Array18();
		array.rearrange(arr, length);
		System.out.println(Arrays.toString(arr));
	}
	public void rearrange(int []arr, int length) {
		int max_index = length-1;
		int min_index = 0;
		int max_element = arr[max_index]+1;
		int i;
		for(i=0;i<length;i++) {
			if(i%2==0) {
				arr[i]+= arr[max_index]%max_element*max_element;
				max_index--;
			}
			else
			{
				arr[i]+= arr[min_index]%max_element*max_element;
				min_index++;
			}
		}
		for( i=0;i<length;i++) {
	//		arr[i] = arr[i]%10;
			arr[i] = arr[i]/max_element;
	}
		
		
	}
}
