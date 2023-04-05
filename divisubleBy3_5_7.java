package Part1;

public class divisubleBy3_5_7 {

	public static void main(String[] args) {
		int[] arr= {3,5,15,45,42,63};
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%3==0&&arr[i]%5==0||arr[i]%7==0) {
				System.out.println(arr[i]);
			}
		}

	}

}
