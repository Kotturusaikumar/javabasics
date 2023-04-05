package Part1;

import java.util.Arrays;

public class  Sum_FirstPositive_LastNegative{

	public static void main(String[] args) {
		int[]arr= {10,20,30,-20,-55,65,-12};
		int v = 0;
		int s = 0;
		int sum = 0;
//		int leftindex=0;
//		int rightindex=arr.length-1;
//		while(leftindex<rightindex) {
//		while(arr[leftindex]%2==0 ) {
//			leftindex++;
//		}
//		while(arr[rightindex]%2!=0 ) {
//			rightindex--;
//		}
//		if(leftindex<rightindex) {
//			int temp=arr[leftindex];
//			arr[leftindex]=arr[rightindex];
//			arr[rightindex]=temp;
//			leftindex++;
//			rightindex--;
//		}
//		
//		}
//		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i <= arr.length-1; i++) {
			if(arr[i]<0) {
				v=arr[i];
				break;
			}
		}
		for(int j =arr.length-1; j>=0; j--) {
			if(arr[j]>0) {
				s= arr[j];
				break;
			}
		}
		sum= v + s;
		System.out.println(sum);
	}

}
