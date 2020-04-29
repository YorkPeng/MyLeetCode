/*
 * @lc app=leetcode.cn id=1095 lang=java
 *
 * [1095] 山脉数组中查找目标值
 */

// @lc code=start
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int mid = findTop(mountainArr, 0, mountainArr.length()-1);
        int leftPlace =   findLeft(mountainArr, 0, mid,target);
        int rightPlace = findRight(mountainArr, mid+1, mountainArr.length()-1,target);
        return leftPlace==-1?rightPlace:rightPlace==-1?leftPlace:Math.min(leftPlace,rightPlace);
    }

    private int findTop(MountainArray mountainArr,int left, int right){
        int l = left;
        int r = right;
        int mid = 0;
        int leftNumber = 0;
        int midNumber = 0;
        while(l<r){
            mid = l + (r-l)/2;
            leftNumber = mountainArr.get(l);
            midNumber = mountainArr.get(mid);
            if(leftNumber<midNumber){
                if(midNumber < mountainArr.get(mid+1)){
                    l = mid+1;
                }else{
                    r = mid;
                }
            }else if(leftNumber == midNumber&& l == mid){
                break;
            }else{
                r = mid-1;
            }
        }
        return r;
    }

    private int findLeft(MountainArray mountainArr,int left, int right, int target){
        int l = left;
        int r = right;
        int mid = 0;
        int midNumber = 0;
        while(l<=r){
            mid = l + (r-l)/2;
            midNumber=mountainArr.get(mid);
            if(midNumber == target){
                return mid;
            }else if(midNumber>target){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return -1;
    }
    private int findRight(MountainArray mountainArr,int left, int right, int target){
        int l = left;
        int r = right;
        int mid = 0;
        int midNumber = 0;
        while(l<=r){
            mid = l + (r-l)/2;
            midNumber=mountainArr.get(mid);
            if(midNumber == target){
                return mid;
            }else if(midNumber>target){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return -1;
    }
}
// @lc code=end

