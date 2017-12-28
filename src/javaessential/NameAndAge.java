package javaessential;
import java.util.Arrays;
import java.util.Scanner;
/*
The java.util.Scanner class is a simple text scanner which can parse primitive types and strings using regular expressions.
Source: https://www.tutorialspoint.com/java/util/java_util_scanner.htm
 */

public class NameAndAge {

	public static void main(String[] args) {
		//System.out.println(args);
		String prompt = String.join(" ", args);
		System.out.println(prompt);
		String name;
		int age;
		Scanner in = new Scanner(System.in);
		name = in.nextLine();
		age = in.nextInt();
		System.out.println("Hello, " + name + " nice to meet you!\nYou are " + age + " years old!");

	}

}
