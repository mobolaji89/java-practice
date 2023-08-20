// Write a function that reverses a string. The input string is given as an array of characters s.

package arraysandstrings;

class ReverseArray {
  public static void main(String[] args) {
	  
	char[] s = {'h','e','l','l','o'};
    System.out.println(reverseString(s));
    
    System.out.println(reverseString2(s));
    
    
  }

  public static char[] reverseString(char[] s) {
      
      int size = s.length;
      char[] reverseArray = new char[size];
      
      int left = 0;
      int right = size - 1;
          
      while (left < size) {
          reverseArray[left] = s[right];
          left++;
          right--;
      }
	return reverseArray;
      
  }
  
  public static char[] reverseString2(char[] s) {
	  
      int left = 0, right = s.length - 1;
      while (left < right) {
          char tmp = s[left];
          s[left++] = s[right];
          s[right--] = tmp;
      }
    return s;  
  }
}