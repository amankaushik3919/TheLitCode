import java.lang.*;
class Solution {
    public boolean isPalindrome(String s) {
       String s1 = "";
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                s1 += c;
            }
        }
        String k = s1.toLowerCase();
        StringBuilder reversed = new StringBuilder(k).reverse();
        return reversed.toString().equals(k);
    }
}



