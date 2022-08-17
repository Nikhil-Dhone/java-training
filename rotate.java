package array_collection;
import java.util.*;


public class rotate {
	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		li.add(6);
			Collections.rotate(li,2);
		
		System.out.println(li);
		
	}

}
