package echelon.interviewPreparationKit;

import java.util.HashSet;

public class SockMerchant {
	
	public static void testCases() {
		System.out.println("Sock Merchant - Author: Shafet - Difficulty: Easy");
		System.out.println("TestCase 0:");
		
		int n = 9;
		int ar[] = {10,20,20,10,10,30,50,10,20};
		
		System.out.println(solution(n, ar) + "\n");
	}
	
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
