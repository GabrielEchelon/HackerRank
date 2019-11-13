package echelon.interviewPreparationKit;

public class JumpingOnTheClouds {
	
	public static void testCases() {
		System.out.println("Jumping On The Clouds - Author: Shafaet - Difficulty: Easy");
		System.out.println("TestCase 0:");
		
		int n = 7;
		int c[] = {0,0,1,0,0,1,0};
		
		System.out.println(solution(n, c) + "\n");
		
		System.out.println("TestCase 1:");
		
		n = 6;
		int d[] = {0,0,0,0,1,0};
		System.out.println(solution(n, d) + "\n");
		
	}
	
	public static int solution(int n, int[] c) {
        int jumps = 0;
        
        int back = 1;
        int cloud = 0;
        int next = 0;
        
        int pattern = 0;
        
        for(int i = 0; i < n; i++) {
            back = (i != 0) ? c[i-1] : 1;
            cloud = c[i];
            next = (i+1 < n) ? c[i+1] : 1;
            
            if((back + cloud + next + pattern) != 0) {
                if(next == 0) {
                    jumps++;
                    pattern = 0;
                }
            }else {
                pattern = 1;
            }
        }
        
        return jumps;

    }

}
