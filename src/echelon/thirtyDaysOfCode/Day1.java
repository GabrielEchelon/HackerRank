package echelon.thirtyDaysOfCode;

import java.util.Scanner;

public class Day1 {
	
	public void solution(int i, double d, String s) {
		Scanner scan = new Scanner(System.in);
		
		int i2 = scan.nextInt();
		double d2 = scan.nextDouble();
		scan.nextLine();
		String s2 = scan.nextLine();
		
		System.out.println(i + i2);
		System.out.println(d + d2);
		System.out.println(s + s2);
		
		scan.close();
	}

}
