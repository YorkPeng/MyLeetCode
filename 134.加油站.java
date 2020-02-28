/*
 * @lc app=leetcode.cn id=134 lang=java
 *
 * [134] 加油站
 */
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        for(int i = 0; i < gas.length; i++){
            sum+= gas[i] - cost[i];
        }
        if(sum < 0){
            return -1;
        }
        int start = 0;
        int rest = 0;
        for(int i = 0; i < gas.length; i++){
            rest += gas[i] - cost[i];
            if(rest < 0){
                start = i+1;
                rest = 0;
            }
        }
        return start;
    }
}

