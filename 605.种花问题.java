/*
 * @lc app=leetcode.cn id=605 lang=java
 *
 * [605] 种花问题
 */

// @lc code=start
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = n;
        int i = 0;
        while(i < flowerbed.length && count > 0){
            if(i == 0){
                if(flowerbed.length == 1){
                    if(flowerbed[i] == 0){
                        count--;
                    }
                    break;
                }
                if(flowerbed[i] == 0 && flowerbed[i+1]==0){
                    count--;
                    i+=2;
                }else{
                    i++;
                }
            }else if(i == flowerbed.length-1){
                if(flowerbed[i] == 0 && flowerbed[i-1] == 0){
                    count--;
                }
                i++;
            }else if(flowerbed[i] == 0){
                if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
                    count--;
                    i+=2;
                }else{
                    i++;
                }
            }else{
                i+=2;
            }
        }
        if(count <=0){
            return true;
        }
        return false;
    }
}
// @lc code=end

