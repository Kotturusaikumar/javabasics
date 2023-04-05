package Part1;

public class SecondLargest {

	public static void main(String[] args) {
		int[] a= {10,20,30,90,20,70};
		int largest=0;
		int secondlargest=0;
		for(int i=0;i<a.length;i++) {
			if(largest<secondlargest) {
				secondlargest=largest;
				largest=a[i];
			}
			else if(secondlargest<a[i]) {
				secondlargest=a[i];
			}
		}
		System.out.println("secondlargest"+secondlargest);

	}

}
