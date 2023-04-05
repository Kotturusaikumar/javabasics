package Part1;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int[] arr1=new int[arr.length];
		int j=0;
		for(int i=0;i<=arr.length-1;i++) {
			
			arr1[j++]=arr[i];
			
		}
		System.out.println(Arrays.toString(arr1));

	}

}
