class Solution {
    public int smallestEvenMultiple(int n) {
        int x = 1;
        while(x==x) {
            if(x%2 == 0 && x%n == 0) {
                return x;
            }
            x+=1;
        }
        return 0;
    }
}