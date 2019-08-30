package ArrayRotation;

public class Array13 {
	public static void main(String []args) {
		int []arr = new int[] {2,4,8,9};
		int length = arr.length;
		Array13 array = new Array13();
		int x = array.hammingdistance(arr, length);
		System.out.println(x);
	}
	public int hammingdistance(int []arr , int length) {
		int []arr1 = new int[2*length+1];
		for(int i=0;i<length;i++) {
			arr1[i] = arr[i];
			arr1[i+length] = arr[i];
		}
		int maxham = 0;
		for(int i = 1;i<length;i++) {
			int currham = 0;
			for(int j=i,k=0;j<i+length;k++,j++) 
				if(arr1[j] != arr[k])
					currham++;
			if(currham == length)
				return length;
			maxham = Math.max(maxham,currham);
			}
			return maxham;
			
	}
}