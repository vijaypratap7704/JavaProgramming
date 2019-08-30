package ArrayRotation;

public class Array10 {
	public static void main(String []args) {
		int []arr = new int[] {2,5,6,76,45,76,88,91,92,997,98,99,100};
		Array10 array = new Array10();
		array.leftrotation(arr,3,arr.length);
		array.leftrotation(arr, 6, arr.length);
		array.leftrotation(arr,25,arr.length);
		
	}
	public void leftrotation(int[] arr, int k,int n) {
		int x = k%n;
		for(int i=x;i<(x+n);i++) {
			System.out.print(arr[i%n]);
		}
	}
}
