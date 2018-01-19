package datatypesandoperators;

public class SCops {

	public static void main(String[] args) {
		int n, d, q;
		
		n = 10;
		d = 2;
		if(d != 0 && (n % d) == 0)
			System.out.println(d + " is a factor of " + n);
		
		d = 0; // set d to 0
		
		// Since d is zero, the second operand is not evaluated.
		if(d != 0 && (n % d) == 0)
			System.out.println(d + " is a factor of " + n);
		
		/*
			Try the same thing without the short-circuit operator.
		 	Causes a divide-by-zero error.
		 */
		/*
		if(d != 0 & (n % d) == 0)
			System.out.println(d + " is a factor of " + n);
		*/
	}

}
