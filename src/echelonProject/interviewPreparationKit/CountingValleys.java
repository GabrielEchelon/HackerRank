package echelonProject.interviewPreparationKit;

public class CountingValleys {

	public static int countingValleys(int n, String s) {
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
