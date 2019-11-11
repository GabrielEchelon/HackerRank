package echelon.interviewPreparationKit;

public class CountingValleys {
	
	public static void testCases() {
		System.out.println("Counting Valleys - Author: pkacprzak - Difficulty: Easy");
		System.out.println("TestCase 0:");
		
		int n = 8;
		String s = "UDDDUDUU";
		
		System.out.println(solution(n, s) + "\n");
	}

	public static int solution(int n, String s) {
        int level = 0;
        int valley = 0;

        for(char c : s.toCharArray()){
            level += (c == 'U') ? +1 : -1;

            if(level == 0 && c == 'U')
                valley++;

        }
        
        return valley;

    }
	
}
