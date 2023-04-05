package Part1;

import java.util.Arrays;

public class Divisibleby4_7 {

	public static void main(String[] args) {
		int[] arr= {3,5,16,45,42,63};
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%4==0||arr[i]%7==0)
				System.out.println(arr[i]);	
	}
		
}
}
