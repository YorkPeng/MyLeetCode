import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=57 lang=java
 *
 * [57] 插入区间
 */

// @lc code=start
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(newInterval.length == 0){
            return intervals;
        }
        if(intervals.length == 0){
            return new int[][] {{newInterval[0],newInterval[1]}};
        }
        ArrayList<int[]> list = new ArrayList<>();
        int start = newInterval[0];
        int end = newInterval[1];
        boolean first = true;
        boolean add = false;
        for(int i = 0; i < intervals.length;i++){
            if(start > intervals[i][1]){
                if(first && !add) {
                    list.add(intervals[i]);
                }else {
                    list.add(new int[]{start,end});
                    i--;
                    first = true;
                    add = true;
                }
            }else if (end < intervals[i][0]){
                if(add) {
                    list.add(intervals[i]);
                }else {
                    list.add(new int[]{start,end});
                    i--;
                    first = true;
                    add = true;
                }
            }else if(end >= intervals[i][0] && start <= intervals[i][1]){
                first = false;
                start = Math.min(start,intervals[i][0]);
                end = Math.max(end, intervals[i][1]);
            }
        }
        if(!add){
            list.add(new int[] {start,end});
        }
        int[][] result = new int[list.size()][2];
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
// @lc code=end

