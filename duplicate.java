package duplicate_array;

public class duplicate {
	
	
	
	public static void main(String[] args) { 
		
		int a[] = {1,2,2,4,3,3,2};
		
		System.out.println("Duplicate Value:");
		for(int i=0;i<a.length;i++){ 
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[j]);
				}
				
			}
		}
		
		
		
	}
}
