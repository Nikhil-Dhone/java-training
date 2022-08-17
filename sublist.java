package array_collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class sublist {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(1);
		li.add(3);
		li.add(3);
		li.add(4);
		
		List<Integer> sub = new ArrayList<Integer>();
		sub.add(3);
		sub.add(4);

		System.out.println(Collections.indexOfSubList(li,sub));	
		System.out.println(Collections.lastIndexOfSubList(li,sub));	

		
	}

}
