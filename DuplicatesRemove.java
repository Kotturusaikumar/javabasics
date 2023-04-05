package Part1;

import java.util.Arrays;

public class DuplicatesRemove {
	public static void main(String[] args) {
		int[] arr= {10,20,30,10};
		Arrays.sort(arr);
		int[] temp=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) 
				temp[j++]=arr[i];
		 }		
		temp[j]=arr[arr.length-1];
		
		arr=new int[j+1];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=temp[i];
			
		}
		System.out.println(Arrays.toString(arr));
		
}
}
		
