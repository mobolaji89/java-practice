package datatypesandoperators;

public class CastDemo {

	public static void main(String[] args) {
		double x, y;
		byte b;
		int i;
		char ch;
		
		x = 10.0;
		y = 3.0;
		
		// Truncation will occur in this conversion
		i = (int) (x / y); // cast double to int
		
		// No loss of info here. A byte can hold the value 100.
		i = 100;
		b = (byte) i;
		System.out.println("Value of b: " + b);
		
		// Information loss this time. A byte cannot hold the value 257.
		// A byte can only hold values from the range -128 minimum value to 127 maximum value.
		i = 257;
		b = (byte) i;
		System.out.println("Value of b: " + b);
		
		// This hows a cast between incompatible types
		b = 88; // ASCII code for X
		ch = (char) b;
		System.out.println("ch: " + ch);
		// No information is lost but a cast is needed when assigning byte to char
	}

}
