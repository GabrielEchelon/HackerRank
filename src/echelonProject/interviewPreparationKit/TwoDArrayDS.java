package echelonProject.interviewPreparationKit;

public class TwoDArrayDS {
	
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