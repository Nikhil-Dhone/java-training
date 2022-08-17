package last_string;

public class last_string {

	public static int len(String s) {
		s = s.trim();
		int li = s.lastIndexOf(" ")+1;
		
		return s.length() - li;
	}	
	
		public static void main(String[] args) {
			
			System.out.println(len("Hello Nik"));
			
		
	}
		
}
	

