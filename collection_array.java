package array_collection;
import java.util.*;

public class collection_array {
	
	public static void main(String[] args) {
	
	List<Integer> li = new ArrayList<Integer>();
	li.add(1);
	li.add(2);
	li.add(3);
	System.out.println("Collection"+li);
	
	Integer[] arr = li.toArray(new Integer[0]);
	
	for (Integer i : arr) {
		System.out.println(i);
		
	}
	
	
	}
}
