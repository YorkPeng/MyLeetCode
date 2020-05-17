/*
 * @lc app=leetcode.cn id=93 lang=java
 *
 * [93] 复原IP地址
 */

// @lc code=start
class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<>();
        if(s == null || s.length() == 0){
            return ans;
        }
        backtracking(ans, 0, s, new ArrayList<String>());
        return ans;
    }
    private void backtracking(List<String> ans, int pos, String s, List<String> temp){
        if(temp.size() == 4){
            if(pos == s.length()){
                ans.add(String.join(".", temp));
            }
            return;
        }
        for(int i = 1; i <=3; i++){
            if(pos+i > s.length()){
                break;
            }
            String str = s.substring(pos, pos+i);
            if((str.startsWith("0") && str.length() > 1) || (Integer.parseInt(str) > 255 && i == 3)){
                continue;
            }
            temp.add(str);
            backtracking(ans,pos+i,s,temp);
            temp.remove(temp.size()-1);
        }
        
    }
}
// @lc code=end

