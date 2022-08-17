package array_collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class hasmap {
	
	public static void main(String[] args) {
	
	Map <Integer,String> hs = new HashMap<>();
	hs.put(1,"C");
	hs.put(2, "C++");
	hs.put(3, "JAVA");
	hs.put(4, "Python");
	
	Iterator<Entry<Integer, String>> it =hs.entrySet().iterator();
	while(it.hasNext()) {
		Entry<Integer,String> en = it.next();
		System.out.println("Key: "+en.getKey());
		System.out.println("Value: "+en.getValue());
	}
	
	
	}
}
