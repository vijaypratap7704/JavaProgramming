package ArrayRotation;

public class Array9 {
	public static void main(String []args) {
		int[] arr = new int[] {45,67,89,90,1,34,37,39};
		Array9 array = new Array9();
		System.out.println(array.pivotvalue(arr));
	}
	public int pivotvalue(int[] arr) {
		int i;
		for(i=0;i<arr.length;i++) {
			if(arr[i+1]<arr[i])
				break;
		}
		return i+1;
	}

}
