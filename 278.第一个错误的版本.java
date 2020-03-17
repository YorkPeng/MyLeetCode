/*
 * @lc app=leetcode.cn id=278 lang=java
 *
 * [278] 第一个错误的版本
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int big = n;
        int mid = low + (big-low)/2;
        int index = -1;
        while(low <= big){
            if(isBadVersion(mid)){
                big =mid-1;
                index = mid;
            }else{
                low = mid +1;
            }
            mid = low + (big - low )/2;
        }
        return index;
        
    }
}
// @lc code=end

