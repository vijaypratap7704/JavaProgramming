package ArrayRotation;
import java.util.*;

public class Array5 {

	public static void main(String[] args) {
		int j = 0;
		int[] arr = new int[] {10,13,15,17,5,6,9};
		Scanner in = new Scanner(System.in);
		System.out.println("input number for search");
		int x = in.nextInt();
		Array5 array = new Array5();
		array.checkpivot(arr,j);
		if(x<arr[0])
			array.binarysearch(arr,array.checkpivot(arr,j)+1,arr.length-1, x);
		else
			array.binarysearch(arr, 0,array.checkpivot(arr,j), x);
	}
	public static int checkpivot(int[] arr,int j) {
		for(j=0;j<arr.length;j++) {
			if(arr[j]>arr[j+1]) {
				return j;
			}
		}
		return arr.length;
	}
	public int binarysearch(int[] arr, int low,int high, int x) {
		int mid;
		mid = (low+high)/2;
		if(x == arr[mid]) {
			System.out.println(mid);
			return mid;
		}
		if(arr[mid]>x) {
			return binarysearch(arr,low,mid,x);
		}
		if(arr[mid]<x) {
			return binarysearch(arr,mid,high,x);
		}
			
		return -1;
	}

}
