package Part1;

import java.util.Arrays;

public class FirstEven_LastOdd_SWAP {

	public static void main(String[] args) {
		int[] arr= {1,7,8,9,10,11,12,2,5};
		int leftindex=0;
		int rightindex=arr.length-1;
		while(leftindex<rightindex) {
		while(arr[leftindex]%2==0 ) {
			leftindex++;
		}
		while(arr[rightindex]%2!=0 ) {
			rightindex--;
		}
		if(leftindex<rightindex) {
			int temp=arr[leftindex];
			arr[leftindex]=arr[rightindex];
			arr[rightindex]=temp;
			leftindex++;
			rightindex--;
		}
		
		}
		System.out.println(Arrays.toString(arr));
		int x=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=x;
		System.out.println(Arrays.toString(arr));
		

	}

}
