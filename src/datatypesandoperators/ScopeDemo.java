package datatypesandoperators;

// Demonstrates block scope within Java

public class ScopeDemo {

	public static void main(String[] args) {
		int x; // known to all code within main class
		
		x = 10;
		if (x == 10) { // start new scope within if block
			
			int y = 20; // known only to this block
			
			// x and y both known here.
			
			System.out.println("x and y: " + x + " " + y);
			x = y * 2;
		}
		// y = 100; // Error because y is outside of it's scope.
		
		// x is still known here.
		System.out.println("x is " + x);
	}
}
