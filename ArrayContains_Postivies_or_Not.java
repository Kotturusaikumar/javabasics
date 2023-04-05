package Part1;

public class ArrayContains_Postivies_or_Not {

	public static void main(String[] args) {
		int[] a= {10,20,30-29,60,70};
		boolean flag=true;
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				flag=false;
			break;
			}
		}
		if(flag==true)
			System.out.println("Array Contains only positive numbers");
		else
			System.out.println("Array contains negative numbers");

	}

}
