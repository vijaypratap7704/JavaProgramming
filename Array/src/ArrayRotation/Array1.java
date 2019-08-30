package ArrayRotation;
import java.util.*;
//Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.

public class Array1 {
	public static void main(String []args) {
		int i=0;
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
		Scanner in = new Scanner(System.in);
		System.out.println("input rotation of array");
		int d = in.nextInt();
		Array1 Array = new Array1();
		Array.left(d,arr);
		Array.algoimpl(arr, d, i);
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]+" ");
		}
					
	}
	public void left(int d,int[] arr) {
		for(int i=0;i<d;i++) {
			leftshift(arr,d);
		}
	}
	public void leftshift(int []arr,int d) {
		int temp = arr[0];
		int j;
		for(j=0;j<arr.length-1;j++) 
			arr[j] = arr[j+1];
		arr[j] = temp;
		
	}
	public void algoimpl(int []arr,int d,int i) {
		for(int j=0;j<d;j++) {
			jugglingalgorithm(arr,d,i);
			i++;
		}
	}
	public void jugglingalgorithm(int[] arr, int d,int i) {
		int j=i;
		int temp = arr[j];
		for(j=i;j<arr.length-3;j=j+3) {
			arr[j] = arr[j+3];
		}
		arr[j] = temp;
	} 

}
