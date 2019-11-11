package echelon.interviewPreparationKit;

public class RepeatedString {
	
	public static void testCases() {
		System.out.println("Repeated String - Author: tunyash - Difficulty: Easy");
		System.out.println("TestCase 0:");
		
		String s = "aba";
		long n = 10l;
		
		System.out.println(solution(s, n) + "\n");
		
		System.out.println("TestCase 1:");
		
		s = "a";
		n = 1000000000000l;
		
		System.out.println(solution(s, n) + "\n");
		
	}
	
	public static long solution(String s, long n) {
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
