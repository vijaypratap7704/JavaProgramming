package ArrayRotation;
import java.util.*;


//Find if there is pair with given sum
public class Array6 {
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[]{3,4,5,7,8,9,1,2};
		System.out.println("input the number for search");
		int x = in.nextInt();
		int length = arr.length;
		Array6 array = new Array6();
		int y=array.pivotvalue(arr, length, x);
		System.out.println(y);
		
		
	}
	
	public static int pivotvalue(int[] arr, int length, int x) {
		int i;
		for(i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1])
				break;
		}
		int l  =i+1;
		int r =i;
		int cnt = 0;
		while(l!=r) {
			if(arr[l]+arr[r] == x)
				cnt++;
			if(arr[l]+arr[r]<x)
				l = (l+1)%length;
			if(arr[l]+arr[r]>x)
				r = (r+length-1)%length;
		}
		System.out.println(cnt);
		return cnt;
		
	}

}
