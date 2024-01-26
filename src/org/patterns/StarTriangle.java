package org.patterns;

public class StarTriangle {
	void halfPattern() {
		for(int row=1;row<=5;row++) {
			
			for(int col=1;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	 void reverseHalf() {
		for(int row=1;row<=5;row++) {
			for(int col=5;col>=row;col--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	
public static void main(String[] args) {
	StarTriangle s = new StarTriangle();
	s.halfPattern();
	s.reverseHalf();
}
}
