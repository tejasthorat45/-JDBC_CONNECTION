package CUSTOM_EXECEPTION;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A number To calculate factorial");

		int n = sc.nextInt();
		int re=Recufact.calcfact(n);
		System.out.println(re);
	}
	
	
	

}
