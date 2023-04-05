package Part1;

public class EvenArray_OddArray {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60};
		System.out.println(arr.length);
		if(arr.length%2==0)
			System.out.println("given array is evenArray");
		else
			System.out.println("given array is odd array");
	}

}
