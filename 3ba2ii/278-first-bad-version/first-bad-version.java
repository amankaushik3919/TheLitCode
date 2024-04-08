/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1, high=n, mid, res=-1;
        // if(isBadVersion(high)==false) return n;
        
        while(low<=high){
            mid=low+(high-low)/2;
            if(isBadVersion(mid)){
                res=mid;
                high=mid-1;
            }else{
                low = mid+1;
            }
        }
        return res;
    }
}
