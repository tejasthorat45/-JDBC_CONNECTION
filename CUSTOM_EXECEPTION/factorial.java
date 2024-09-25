package CUSTOM_EXECEPTION;

import java.math.BigInteger;
import java.util.*;

public class factorial {

	public static BigInteger  calcfactorial(int n) {

		if (n == 1 || n == 0) {
			return BigInteger.ONE;

		}

		BigInteger fact = BigInteger.ONE;
		
		for (int i = 2; i <= n; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		return fact;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A number To calculate factorial");

		int n = sc.nextInt();

		if (n < 0) {
			System.out.println("factorial of negative number can not define");
		} else {
			BigInteger fact = calcfactorial(n);
			System.out.println("Factorial of " + n + " is " + fact);
		}

	}

}
