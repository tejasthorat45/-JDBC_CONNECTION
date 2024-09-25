package CUSTOM_EXECEPTION;

import java.util.Scanner;

public class Drivinglin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age");
		
		try {
			
			int age = sc.nextInt();
			if(age<18) {
				 throw new AgeIsToLow("You are child");
				 
			}
			
		} catch(AgeIsToLow e) {
			e.printStackTrace();
			System.out.println("age is to low for driving linces");
		} 
		
		finally {
			System.out.println("Thanks For visit");
		}
		
		
		
		
		
		

	}

}
