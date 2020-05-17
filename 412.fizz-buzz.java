import java.util.ArrayList;
/*
 * @lc app=leetcode.cn id=412 lang=java
 *
 * [412] Fizz Buzz
 */

// @lc code=start
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList();
        for(int i = 1;i <=n;i++){
            if(i % 3 == 0 && i %5 !=0){
                list.add("Fizz");
            }
            else if(i %3!=0 && i % 5 == 0){
                list.add("Buzz");
            }
            else if(i % 3 == 0 && i %5 ==0){
                list.add("FizzBuzz");
            }else{
                list.add(Integer.toString(i));
            }
        }
        return list;
    }
}
// @lc code=end

