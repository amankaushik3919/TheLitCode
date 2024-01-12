class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s = "";
        for (int i = 0; i < Math.min(word1.length(), word2.length()); i++) {
            s += word1.charAt(i);
            s += word2.charAt(i);
        }
        for (int j = Math.min(word1.length(), word2.length()); j < Math.max(word1.length(), word2.length()); j++) {
            if (word1.length() >= word2.length()) {
                s += word1.charAt(j);
            } else {
                s += word2.charAt(j);
            }
        }
        return s;
    }
}