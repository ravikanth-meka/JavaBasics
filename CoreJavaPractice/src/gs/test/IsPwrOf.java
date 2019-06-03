package gs.test;

public class IsPwrOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 10;
		int powerOf = 10;
		System.out.println(" Number "+ number +" is power of 10 :" + isPowerOf(number,powerOf));
		
		
		
		
		
	}
	
	
	public static boolean isPowerOf(int input, int isPowerOf) {
	    while (input > 1) {
	        if (input % isPowerOf != 0)
	            return false;
	        input = input / isPowerOf;
	    }

	    if (input == 1) {
	        return true;
	    }

	    return false;
	}

}
