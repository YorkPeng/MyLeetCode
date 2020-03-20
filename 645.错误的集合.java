import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=645 lang=java
 *
 * [645] 错误的集合
 * 注释代码为本人初始想法
 * 新补充的算法是看了discussion之后重做的。
 * 统计重复数字的题目，JAVA使用桶数组很好用。
 */

// @lc code=start
class Solution {
    public int[] findErrorNums(int[] nums) {
//        int[] rest = new int[2];
//        int lessSum = 0;
//        int realSum = 0;
//        Set<Integer> set = new HashSet<>();
//        int shown = 0;
//        for(int i =0;i<nums.length;i++){
//            if(set.add(nums[i])){
//                lessSum+=nums[i];
//            }
//            realSum+=nums[i];
//        }
//        for(int i = 1;i <= nums.length;i++){
//            if(!set.contains(i)){
//                shown = i;
//            }
//        }
//        rest[1] = shown;
//        rest[0] = realSum-lessSum;
//        return rest;
        int[] bucket = new int[nums.length+1];
        int[] rest = new int[2];
        for(int i =0;i<nums.length;i++){
            bucket[nums[i]]++;
        }
        for(int i = 1; i < bucket.length;i++){
            if(bucket[i] == 0){
                rest[1] = i;
            }
            if(bucket[i] == 2){
                rest[0] = i;
            }
        }
        return rest;
    }
}
// @lc code=end

