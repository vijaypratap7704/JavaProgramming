package ArrayRotation;

public class Array12 {
	public static void main(String []args) {
		int[] arr = new int[] {1,3,5,7,9};
		int n = arr.length;
		Array12 array = new Array12();
		for(int i=0;i<n;i++) {	
			System.out.println(arr[i]);
		}
		array.reversearray(arr,0,n);
		array.printarray(arr, n);
		//for(int i=0;i<n;i++) {	
		//	System.out.println(arr[i]);
	//	}
	}
	public int[] reversearray(int[] arr,int k ,int n) {
		int temp;
		int i,j;
		for(i=k,j=n-1;i<j;i++,j--);
		{	
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		return arr;
		
	}
	public void printarray(int[] arr,int n) {
		for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
	}}
}
