package org.patterns;

public class FullTriangleUsingNumber1 {

	public void pattern() {
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for (int k=0;k<2*i-1;k++) {
				System.out.print("1");
			}
			System.out.println(" ");
		}
		
	}
	public static void main(String[] args) {
		FullTriangleUsingNumber1 full = new FullTriangleUsingNumber1();
		full.pattern();
	}
}
