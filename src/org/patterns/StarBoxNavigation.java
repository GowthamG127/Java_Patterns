package org.patterns;

public class StarBoxNavigation {
	public static void main(String[] args) {
		for(int i=1;i==1;i++) {
			for(int j=1;j<=5;j++) {
				if(j==1||j==5) {
					System.out.println("*  *  *  *  *");
					
				}
				else if(j==2){
					System.out.println("*     ^     *");
				}
				else if(j==4) {
					System.out.println("*     v     *");
				}
				else {
					System.out.println("*  <  *  >  *");
				}
			}
			System.out.println(" ");
		}
	}
}
