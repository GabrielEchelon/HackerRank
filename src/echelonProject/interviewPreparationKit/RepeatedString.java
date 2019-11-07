package echelonProject.interviewPreparationKit;

public class RepeatedString {
	
	public static long repeatedString(String s, long n) {
		long result = 0l;
		
		for(char c : s.toCharArray()) {
			if(c == 'a' || c == 'A') result++;
		}
		
		long size = n / s.length();
		result =  size * result;
		
		long remains = n % s.length();
		for(int i = 0; i < remains; i++) {
			if(s.charAt(i) == 'a' || s.charAt(i) == 'A') {
				result++;
			}
		}
	    
		return result;
	}

}
