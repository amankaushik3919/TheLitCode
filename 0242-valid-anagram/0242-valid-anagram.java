class Solution {
    public boolean isAnagram(String s, String t) {
        s = s.replace(" ", "").toLowerCase();
        t = t.replace(" ", "").toLowerCase();
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        if(a.length > b.length || a.length < b.length){
            return false;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0; i<a.length; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
}
