package ArrayRotation;
// Find the maximum sum of array using pivot value

public class Array8 {
	public static void main(String []args) {
		int []arr = new int[] {8,3,1,2};
		Array8 array = new Array8();
		int sum = array.maxsum(arr);
		System.out.println(sum);
	}
	public int maxsum(int[] arr) {
		int pivot = findpivot(arr);
		int length = arr.length;
		int sum =0;
		int diff = length-1-pivot;
		for(int i=0;i<length;i++) {
			sum =sum+(i+diff)%length*arr[i];
		}
		return sum;
		
	
	}
	public int findpivot(int[] arr) {
		int i;
		int length=arr.length;
		for(i=0;i<length;i++) {
			if(arr[i]>arr[i+1])
				break;
		}
		return i;
	}
}