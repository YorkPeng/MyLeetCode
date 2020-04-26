/*
 * @lc app=leetcode.cn id=52 lang=java
 *
 * [52] N皇后 II
 */

// @lc code=start
class Solution {
    public int totalNQueens(int n) {
        List<List<Integer>> save = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backTracking(save,temp,0,n);
        return save.size();
    }

    private void backTracking(List<List<Integer>> save, List<Integer> temp, int pos, int n){
        if(pos >= n){
            List<Integer> list = new ArrayList<>(temp);
            save.add(list);
            return;
        }
        for (int i = 0; i < n; i++){
            if(isValid(i,temp,pos)){
                temp.add(i);
                backTracking(save,temp,pos+1,n);
                temp.remove(temp.size()-1);
            }
        }
    }

    private boolean isValid(int current, List<Integer> temp,int pos){
        for (int i = 0;i < temp.size();i++){
            if(current == temp.get(i)){
                return false;
            }
            if(Math.abs(current - temp.get(i)) == Math.abs(pos-i)){
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

