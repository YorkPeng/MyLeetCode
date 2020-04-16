import java.util.Arrays;
import java.util.Comparator;

/*
 * @lc app=leetcode.cn id=56 lang=java
 *
 * [56] 合并区间
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length<1){
            return intervals;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        ArrayList<int[]> list = new ArrayList<>();
        int end = intervals[0][1];
        int start = intervals[0][0];
        for(int i =1;i<intervals.length;i++){
            if (intervals[i][0] > end) {
                list.add(new int[]{start, end});
                start = intervals[i][0];
            }
            if(end < intervals[i][1]){
                end = intervals[i][1];
            }
            
        }
        list.add(new int[]{start,end});
        int[][] result = new int[list.size()][2];
        for(int i = 0 ;i < list.size();i++){
            result[i][0] = list.get(i)[0];
            result[i][1] = list.get(i)[1];
        }
        return result;
    }
}
// @lc code=end

