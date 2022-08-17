package array_collection;
import java.util.*;

public class array_collection {

	public static void main(String[] args) {
	
	int[] arr = {1,2,3};
	
	List<Integer> items = new ArrayList<>();
	
//    for (int i=0;i<arr.length;i++) {
//       items.add(arr[i]);
//    }
	
	for (int i : arr) {
		items.add(i);
	}
	System.out.println(items);
	}
}