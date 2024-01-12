class Solution {
    public boolean isPalindrome(int x) {
        int temp=0, res=0, n=x;
        if(x>0)
        {
            while(n!=0){
                res=n%10;
                temp = (temp*10)+res;
                n/=10;
            }
        } else {
            n*=-1;
            x = n;
        }

        if(temp == x){
            return true;
        } else {
            return false;
        }
    }
}