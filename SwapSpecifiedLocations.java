package Part1;

import java.util.Arrays;

public class SwapSpecifiedLocations {

	public static void main(String[] args) {
		int arr [] = {1,2,5,7,89,3};
		int temp=0;
		temp=arr[0];
		arr[0]=arr[3];
		arr[3]=temp;
		System.out.println(Arrays.toString(arr));
		
	}

}
