class Solution {
    public int reverse(int x) {
        long temp = 0, res; // 2147483648 // 1534236469
        while (x != 0) {
            res = x % 10;
            temp = (temp * 10) + (res);
            x /= 10;
        }
        return (int) temp == temp ? (int) temp : 0;
    }
}
