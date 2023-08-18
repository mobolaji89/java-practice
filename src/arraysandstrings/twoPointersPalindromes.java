package arraysandstrings;

class Main {
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
