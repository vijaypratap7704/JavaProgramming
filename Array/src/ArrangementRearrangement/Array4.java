package ArrangementRearrangement;
import java.util.Arrays;
public class Array4 {
	public static void main(String []args) {
		int []arr = {2,7,-1,-4,-6,-7,78,54,67,34,87,-90,-78,-56,-43,-23,-123,-567};
		int length = arr.length;
		Array4 array = new Array4();
		array.arrange(arr, length);
		array.printarray(arr, length);
}
public void arrange(int []arr, int length) {
	int i=-1;
	int temp;
	for(int j=0;j<length;j++)
		{
		if(arr[j]<0) {
			i++;
			temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
		}
	}
	int pos = i+1,neg = 0;
	for(pos=i+1,neg=0;pos<length && neg<pos;pos=pos+1,neg = neg+2) {
		temp= arr[pos];
		arr[pos] = arr[neg];
		arr[neg] = temp;
	}
}
	public void printarray(int []arr,int length) {
		for(int i=0;i<length;i++) {
			System.out.println(arr[i]);
		}
		
	}
}
