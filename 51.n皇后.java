/*
 * @lc app=leetcode.cn id=51 lang=java
 *
 * [51] N皇后
 */

// @lc code=start
class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<Integer>> save = new ArrayList<>();
        List<List<String>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backTracking(save,temp,0,n);
        print(save,result,n);
        return result;
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

    private void print(List<List<Integer>> save,List<List<String>> result, int n){
        for (int i = 0;i<save.size();i++){
            List<String> list = new ArrayList<>();
            List<Integer> temp = save.get(i);
            for(int j = 0; j <n; j++){
                StringBuilder sb = new StringBuilder();
                for (int k = 0; k < n; k++){
                    if(k == temp.get(j)){
                        sb.append("Q");
                    }else{
                        sb.append(".");
                    }
                }
                list.add(sb.toString());
            }
            result.add(list);
        }
    }
}
// @lc code=end

