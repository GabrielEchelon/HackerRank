package echelon.interviewPreparationKit;

public class LeftRotation {
	
	public static void testCases() {
		System.out.println("Left Rotation - Author: Heraldo - Difficulty: Easy");
		System.out.println("Test Case 0:");
		
		int[] a = {1,2,3,4,5};
		int d = 4;
		
		System.out.println(printSolution(solution(a, d)) + "\n");
		
		System.out.println("Test Case 1:");
		
		int[] b = {41,73,89,7,10,1,59,58,84,77,77,97,58,1,86,58,26,10,86,51};
		int e = 10;
		
		System.out.println(printSolution(solution(b, e)) + "\n");
	}
		
	public static String printSolution(int[] are){
		StringBuilder solution = new StringBuilder();
		for(int arr : are){
			if(solution.length() != 0){
				solution.append(",");
			}
			solution.append(arr);
		}
		return solution.toString();
	}

	public static int[] solution(int[] arr, int rotat) {
		int[] are = new int[arr.length];
		int i = 0;
		for(int aux = 0; aux < arr.length; aux++){
			are[aux] = (arr.length > aux+rotat) ? arr[aux+rotat] : arr[i++];
		}
		
		return are;
	}
}