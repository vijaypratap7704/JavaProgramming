package ArrayRotation;
// Find the sum of the array of i*arr[i] to be maximum;
  
public class Array7 {
	public static void main(String []args) {
		int []arr = new int[] {1, 20, 2, 10};
		Array7 array = new Array7();
		System.out.println(array.maxsum(arr));
		
	}
	public int maxsum(int[] arr) {
		int length = arr.length;
		int arrsum=0;
		int currvalue =0,maxvalue;
		for(int i=0;i<length; i++) {
			arrsum = arrsum + arr[i];
			currvalue = currvalue +i*arr[i];
			
		}
		maxvalue = currvalue;
		for(int j=1;j<arr.length;j++) {
			currvalue = currvalue+arrsum-length*arr[length-j];
			if(maxvalue<currvalue)
				maxvalue = currvalue;
		}
		return maxvalue;
	}

}
