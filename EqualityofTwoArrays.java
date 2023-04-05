package Part1;

public class EqualityofTwoArrays {

	public static void main(String[] args) {
		int[] a= {10,20,30};
		int[] b= {10,20,30};
		boolean flag=true;
		if(a.length==b.length) {
			for(int i=0;i<a.length;i++) {
				for(int j=i+1;j<b.length;j++) {
					if(a[i]!=b[j]) {
						flag=false;
						break;
				}
				}
			}
			if(flag==true)
				System.out.println("equal");
			else
				System.out.println("not equal");
			}
	
			
		else { 
				System.out.println("not equal");
			}
				
			
					
				}
		}
		

	

}
