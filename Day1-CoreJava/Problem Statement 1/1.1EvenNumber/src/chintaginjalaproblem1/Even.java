package chintaginjalaproblem1;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the n value : ");
        int n = scan.nextInt();
        for (int i = 1; i<=n; i++) {
        	if(i%2==0) {
        		System.out.println(i + "");
        	}
        }

	}

}
