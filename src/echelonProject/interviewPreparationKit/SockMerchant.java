package echelonProject.interviewPreparationKit;

import java.util.HashSet;

public class SockMerchant {
	
	public static int solution(int n, int[] ar){
        
        int pairs = 0;

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            int cost = ar[i];
            
            if(set.contains(cost)){
                set.remove(cost);
                pairs++;
                
            }else{
                set.add(cost);
            }
        }
        
        return pairs;
    }

}
