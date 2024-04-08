class Solution {
    public boolean isPerfectSquare(int num) {
        int a = num;
        if(Math.sqrt(num) == (int) Math.sqrt(num)){
            return true;            
        } else {
            return false;
        }
    }
}