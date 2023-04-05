package Part1;

import java.util.Arrays;
import java.util.HashSet;

public class DuplicatesDemo {

	public static void main(String[] args) {
		/*int[]a= {1,2,3,4,5,6,5,5,5,7,7};
		int j=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				a[j]=a[i];
				j++;
			}
		}
		a[j]=a[a.length-1];
		for(int i=0;i<j+1;i++) {
			System.out.println(a[i]);
		}

	}*/
	int[]a= {1,2,2,3,4,5,5};
	HashSet<Integer>numbers=new HashSet<>();
	for(int i=0;i<a.length;i++) {
		numbers.add(a[i]);
	}
	for(int no:numbers)
		System.out.println(no+" ");
	}

}
