package echelon.interviewPreparationKit;

public class TwoDArrayDS {
	
	public static void testCases() {
		System.out.println("2D Array DS - Author: Shafet - Difficulty: Easy ");
		System.out.println("TestCase 0:");
		
		int[][] i = {{-9,-9,-9,1,1,1}, 
					 {0,-9,0,4,3,2},
					 {-9,-9,-9,1,2,3},
					 {0,0,8,6,6,0},
					 {0,0,0,-2,0,0},
					 {0,0,1,2,4,0}};
		
		System.out.println(solution(i));
		
		System.out.println("TestCase 1:");
		
		int[][] j = {{1,1,1,0,0,0}, 
					 {0,1,0,0,0,0},
					 {1,1,1,0,0,0},
					 {0,0,2,4,4,0},
					 {0,0,0,2,0,0},
					 {0,0,1,2,4,0}};
	
		System.out.println(solution(j));
		
		System.out.println("TestCase 2:");
		
		int[][] k = {{1,1,1,0,0,0}, 
					{0,1,0,0,0,0},
					{1,1,1,0,0,0},
					{0,9,2,-4,-4,0},
					{0,0,0,-2,0,0},
					{0,0,-1,-2,-4,0}};
		
		System.out.println(solution(k));
		
		System.out.println("TestCase 3:");
		
		int[][] l = {{0,-4,-6,0,-7,-6}, 
					{-1,-2,-6,-8,-3,-1},
					{-8,-4,-2,-8,-8,-6},
					{-3,-1,-2,-5,-7,-4},
					{-3,-5,-3,-6,-6,-6},
					{-3,-6,0,-8,-6,-7}};
		
		System.out.println(solution(l));
		
	}
	
	public static int solution(int[][] arr) {
		
		int max = Integer.MIN_VALUE;
		int sum = 0;
		
		for(int line = 0; line <= 3; line++){
            for(int col = 0; col <= 3; col++){
                sum = arr[line + 1][col + 1];
                for(int aux = col; aux < col + 3; aux++){
                    sum += arr[line][aux] + arr[line + 2][aux];
                }            
                if(sum > max)
                    max = sum;
            }
        }
		return max;
	}
}