package echelonProject;

import echelonProject.interviewPreparationKit.CountingValleys;
import echelonProject.interviewPreparationKit.JumpingOnTheClouds;
import echelonProject.interviewPreparationKit.RepeatedString;
import echelonProject.interviewPreparationKit.SockMerchant;

public class Main {

	public static void main(String[] args) {
		
//		sockMerchant();
//		countingValleys();
//		jumpingOnTheClouds();
		repeatedString();
		
		
	}
	
	private static void repeatedString() {
		System.out.println("Repeated String - Author: tunyash - Difficulty: Easy");
		System.out.println("TestCase 0:");
		
//		String s = "aba";
//		long n = 10l;
//		
//		System.out.println(RepeatedString.repeatedString(s, n) + "\n");
		
		String s = "a";
		long n = 1000000000000l;
		
		System.out.println(RepeatedString.repeatedString(s, n) + "\n");
		
	}
	
	private static void jumpingOnTheClouds() {
		System.out.println("Jumping On The Clouds - Author: Shafet - Difficulty: Easy");
		System.out.println("TestCase 0:");
		
		int n = 7;
		int c[] = {0,0,1,0,0,1,0};
		
		System.out.println(JumpingOnTheClouds.jumpingOnClouds(n, c) + "\n");
		
		System.out.println("TestCase 1:");
		n = 6;
		int d[] = {0,0,0,0,1,0};
		System.out.println(JumpingOnTheClouds.jumpingOnClouds(n, d) + "\n");
		
	}
	
	private static void countingValleys() {
		System.out.println("Counting Valleys - Author: pkacprzak - Difficulty: Easy");
		System.out.println("TestCase 0:");
		
		int n = 8;
		String s = "UDDDUDUU";
		
		System.out.println(CountingValleys.countingValleys(n, s) + "\n");
	}
	
	private static void sockMerchant() {
		System.out.println("Sock Merchant - Author: Shafet - Difficulty: Easy");
		System.out.println("TestCase 0:");
		
		int n = 9;
		int ar[] = {10,20,20,10,10,30,50,10,20};
		
		System.out.println(SockMerchant.sockMerchant(n, ar) + "\n");
	}
	
}
