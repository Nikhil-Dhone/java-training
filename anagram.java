package valid_anagram;

public class anagram {
	public static boolean ana(String s , String t) {
		if(s.length() != t.length()) return false;
		int[] cnt = new int[26];
		
		for(char c : s.toCharArray()) {
			cnt[c-'a']--;
		}
		for(char c : t.toCharArray()) {
			if(cnt[c-'a'] == 0) return false;
			cnt[c-'a']--;	
		}
		return true;		
	}
	
	public static void main(String[] args) {
		
		String s = "ab";
		String t = "ba";
		System.out.println(ana(s,t));
		
	}

}
