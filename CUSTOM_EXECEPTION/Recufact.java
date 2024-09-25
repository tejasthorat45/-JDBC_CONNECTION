package CUSTOM_EXECEPTION;

public class Recufact {
	
	public static int calcfact(int n) {
		
		//base case 
		
		if(n ==0 || n==1 ) {
			return 1;
		}
		
		return n*calcfact(n-1);
	}
	

}
