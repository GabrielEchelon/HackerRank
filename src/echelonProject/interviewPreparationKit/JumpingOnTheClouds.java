package echelonProject.interviewPreparationKit;

public class JumpingOnTheClouds {
	
	public static int jumpingOnClouds(int n, int[] c) {
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
