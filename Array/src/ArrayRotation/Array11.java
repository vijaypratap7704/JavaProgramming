package ArrayRotation;

public class Array11 {
	public static void main(String []args) {
		int []arr1=new int[] {4,7,8,9,1,2,3};
		int []arr2 = new int[] {45,48,67,78,98,99,100,1,2};
		Array11 array = new Array11();
		int x = array.findbinarysearch(arr1,0,arr1.length-1);
		int y = array.findbinarysearch(arr2, 0, arr2.length-1);
		System.out.println(x);
		System.out.println(y);
	}
	public int findbinarysearch(int []arr, int low, int high) {
		int mid = (low+high)/2;
		if(arr[low] == arr[high]) 
			return arr[low];
		if(arr[high]>arr[low])
			return arr[low];
		if(arr[mid]<arr[high] && arr[mid-1]>arr[mid])
			return arr[mid];
		if(arr[mid]<arr[low] && arr[mid+1]>arr[mid])
			return arr[mid+1];
		if(arr[mid]>arr[low])
			return findbinarysearch(arr, mid, high);
		return findbinarysearch(arr , low , mid);
	}
}
