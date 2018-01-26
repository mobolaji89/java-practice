package programcontrolstatements;

/* 
	This program reads a character from the keyboard,
	and then prints the key.
 */


public class KbIn {

	public static void main(String[] args) 
		throws java.io.IOException {
		
		char ch;
		
		/* 
		 	the read method actually returns an integer, 
		 	so the value must be cast into a char
		 	to assign it to a char variable.
		 */
		System.out.print("Press a key followed by ENTER: ");
		ch = (char) System.in.read(); // Read a character from the keyboard
		
		System.out.println("Your key is: " + ch);
	}

}

// throws java.io.IOExeption is necessary to handle any input errors
