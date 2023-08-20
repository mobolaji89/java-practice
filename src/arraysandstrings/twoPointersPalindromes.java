/*
Given a string s, return true if it is a palindrome, false otherwise.

A string is a palindrome if it reads the same forward as backward. That means, after reversing it, it is still the same string. For example: "abcdcba", or "racecar".
*/

package arraysandstrings;

class Palindrome {
  public static void main(String[] args) {
	String palindrome = "racecar";
    System.out.println(checkIfPalindrome(palindrome));
    
    String palindrome2 = "mother";
    System.out.println(checkIfPalindrome(palindrome2));
    
    String palindrome3 = "madam";
    System.out.println(checkIfPalindrome(palindrome3));
    
    
  }

  public static boolean checkIfPalindrome(String s) {
    int left = 0;
    int right = s.length() - 1;

    while (left < right) {
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }

        left++;
        right--;
    }

    return true;
  }
}
