package echelonProject;

import echelonProject.interviewPreparationKit.CountingValleys;
import echelonProject.interviewPreparationKit.JumpingOnTheClouds;
import echelonProject.interviewPreparationKit.RepeatedString;
import echelonProject.interviewPreparationKit.SockMerchant;
import echelonProject.interviewPreparationKit.TwoDArrayDS;

public class Main {

	public static void main(String[] args) {
		
		sockMerchant();
		countingValleys();
		jumpingOnTheClouds();
		repeatedString();
		twoDArrayDS();
		
	}
	
	private static void twoDArrayDS() {
		System.out.println("2D Array DS - Author: Shafet - Difficulty: Easy ");
		System.out.println("TestCase 0:");
		
		int[][] i = {{-9,-9,-9,1,1,1}, 
					 {0,-9,0,4,3,2},
					 {-9,-9,-9,1,2,3},
					 {0,0,8,6,6,0},
					 {0,0,0,-2,0,0},
					 {0,0,1,2,4,0}};
		
		System.out.println(TwoDArrayDS.solution(i));
		
		System.out.println("TestCase 1:");
		
		int[][] j = {{1,1,1,0,0,0}, 
					 {0,1,0,0,0,0},
					 {1,1,1,0,0,0},
					 {0,0,2,4,4,0},
					 {0,0,0,2,0,0},
					 {0,0,1,2,4,0}};
	
		System.out.println(TwoDArrayDS.solution(j));
		
		System.out.println("TestCase 2:");
		
		int[][] k = {{1,1,1,0,0,0}, 
					{0,1,0,0,0,0},
					{1,1,1,0,0,0},
					{0,9,2,-4,-4,0},
					{0,0,0,-2,0,0},
					{0,0,-1,-2,-4,0}};
		
		System.out.println(TwoDArrayDS.solution(k));
		
		System.out.println("TestCase 3:");
		
		int[][] l = {{0,-4,-6,0,-7,-6}, 
					{-1,-2,-6,-8,-3,-1},
					{-8,-4,-2,-8,-8,-6},
					{-3,-1,-2,-5,-7,-4},
					{-3,-5,-3,-6,-6,-6},
					{-3,-6,0,-8,-6,-7}};
		
		System.out.println(TwoDArrayDS.solution(l));
		
	}
	
	private static void repeatedString() {
		System.out.println("Repeated String - Author: tunyash - Difficulty: Easy");
		System.out.println("TestCase 0:");
		
		String s = "aba";
		long n = 10l;
		
		System.out.println(RepeatedString.solution(s, n) + "\n");
		
		System.out.println("TestCase 1:");
		
		s = "a";
		n = 1000000000000l;
		
		System.out.println(RepeatedString.solution(s, n) + "\n");
		
	}
	
	private static void jumpingOnTheClouds() {
		System.out.println("Jumping On The Clouds - Author: Shafet - Difficulty: Easy");
		System.out.println("TestCase 0:");
		
		int n = 7;
		int c[] = {0,0,1,0,0,1,0};
		
		System.out.println(JumpingOnTheClouds.solution(n, c) + "\n");
		
		System.out.println("TestCase 1:");
		
		n = 6;
		int d[] = {0,0,0,0,1,0};
		System.out.println(JumpingOnTheClouds.solution(n, d) + "\n");
		
	}
	
	private static void countingValleys() {
		System.out.println("Counting Valleys - Author: pkacprzak - Difficulty: Easy");
		System.out.println("TestCase 0:");
		
		int n = 8;
		String s = "UDDDUDUU";
		
		System.out.println(CountingValleys.solution(n, s) + "\n");
	}
	
	private static void sockMerchant() {
		System.out.println("Sock Merchant - Author: Shafet - Difficulty: Easy");
		System.out.println("TestCase 0:");
		
		int n = 9;
		int ar[] = {10,20,20,10,10,30,50,10,20};
		
		System.out.println(SockMerchant.solution(n, ar) + "\n");
	}
	
}
