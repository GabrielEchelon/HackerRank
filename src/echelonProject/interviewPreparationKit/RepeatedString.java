package echelonProject.interviewPreparationKit;

public class RepeatedString {
	
	public static long repeatedString(String pattern, long n) {
		StringBuilder infinite = new StringBuilder();
		Long size = n;
		Long result = 0l;
		
		while((size) > infinite.length()) {
			infinite.append(pattern);
		}
		infinite.substring(0, size.intValue());
		
		for(char c : infinite.toString().toCharArray()) {
			if(c == 'a' || c == 'A') result++;
		}
		
		return result;
		
	}

}
