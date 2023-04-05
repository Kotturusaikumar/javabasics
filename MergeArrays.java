package Part1;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
		int[] q= {10,20,30};
		int[] r= {40,50,60,70};
		int a=q.length;
		int b=r.length;
		int c1=a+b;
		int[] c= new int[c1];
		for(int i=0;i<a;i++) {
			c[i]=q[i];
		}
		for(int i=0;i<b;i++) {
			c[a+i]=r[i];
		}
		for(int i=0;i<c1;i++) {
		}
		System.out.println(Arrays.toString(c));
	}

}
