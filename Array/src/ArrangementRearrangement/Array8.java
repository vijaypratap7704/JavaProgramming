package ArrangementRearrangement;

public class Array8 {
	public static void main(String []args) {
		 int arr[] = {2, 7, 9, 5, 8, 7, 4}; 
		int k=5;
		int length = arr.length;
		Array8 array = new Array8();
		System.out.println(array.minswap(arr, length, k));
	}
	public int minswap(int []arr,int length, int k) {
		int count = 0;
		for(int i=0;i < length;i++) {
			if(arr[i]<=k)
				count++;	
		}
		int bad = 0;
		for(int j=0;j<5;j++) {
			if(arr[j]>k)
				bad++;
		}
		int ans=bad;
		for(int n=k,m=0;n<length;n++,m++) {
			if (arr[m] < k) 
		        --bad; 
			if(arr[n]>k)
				++bad;
			ans = Math.min(bad, ans);
		}
	return ans;
	}
}
