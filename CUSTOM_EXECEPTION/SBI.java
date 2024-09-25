package CUSTOM_EXECEPTION;

public class SBI extends Gpay {
	
	@Override
	
	public void payNow(int amt) throws ArithmeticException{
		
		System.out.println("Sbi pay now method");
		System.out.println(10/0);
	}
	

}
