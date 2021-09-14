package org.vicky.patterns;

import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
		
		
//			*
//		   ***
//		  *****
//		 *******
		
		Scanner scanner  = new Scanner(System.in);
		int rows = scanner.nextInt();
		scanner.close();
		
		for(int i = 1;i<=rows;i++) {
		//print space
		
			for(int j=i; j<=rows-1;j++) {
				System.out.print(" ");
			}
			
			//print *
			for(int k=1;k<=(i*2)-1;k++) {
				System.out.print("*");
			}
		
		System.out.println();
	}
}
}
