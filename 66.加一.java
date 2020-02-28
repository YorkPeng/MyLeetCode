/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */
class Solution {
    public int[] plusOne(int[] digits) {
        boolean plus = false;
        int i = digits.length -1;
        if(digits[i] == 9){
            plus = true;
            digits[i--] = 0;
        }else{
            digits[i]++;
        }
        if(plus == true){
         for(; i >=0 && plus == true; i--){
             if(digits[i] == 9){
                digits[i] = 0;
                plus = true;
              }else{
                digits[i]++;
                plus = false;
                }
            }
            if(plus == true){
                int[] nums = new int[digits.length + 1];
                nums[0] = 1;
                for(int j = 1; j < nums.length; j++){
                    nums[j] = 0;
                }
                return nums;
            }else{
                return digits;
            }
      }else{
          return digits;
      }
    }
}

