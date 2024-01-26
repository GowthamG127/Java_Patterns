package org.patterns;

import java.util.Scanner;

public class Numbers {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number between 1 - 9 : ");
	Integer num =scan.nextInt();
	if(num>=1 & num<=9) {
	for(int i = 1;i<=num;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(j);
		}
		System.out.println(" ");
	}
	}
	else {
		System.out.println("You have entered an invalid number");
	}
	scan.close();
}
}
