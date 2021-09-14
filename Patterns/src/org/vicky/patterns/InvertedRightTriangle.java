package org.vicky.patterns;

import java.util.Scanner;

public class InvertedRightTriangle {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		int rows = scanner.nextInt();
		scanner.close();
		for(int i = rows; i > 0 ; i--) {
			for(int j=i ; j>0; j--) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
}
