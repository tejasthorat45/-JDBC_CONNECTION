package CUSTOM_EXECEPTION;

public class Gpay {
	
	

	public static void main(String[] args) {
		
		Gpay obj = new SBI();
		try {
			obj.payNow(200);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}

	}

	public void payNow(int amt) throws ArithmeticException {
		// TODO Auto-generated method stub
		
	}

}
