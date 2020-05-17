/*
 * @lc app=leetcode.cn id=299 lang=java
 *
 * [299] 猜数字游戏
 */
class Solution {
    public String getHint(String secret, String guess) {
        int cows = 0, bulls = 0;
        int []count = new int[10];
        for(int i = 0; i < secret.length(); i++){
            count[secret.charAt(i) - '0']++;
        }
        for(int j = 0; j < guess.length(); j++){
            if(guess.charAt(j) == secret.charAt(j)){
                bulls++;
                count[secret.charAt(j) - '0']--;
                if(count[secret.charAt(j) - '0'] < 0){
                    cows--;
                }
            }else if(count[guess.charAt(j) - '0'] > 0){
                cows++;
                count[guess.charAt(j) - '0']--;
            }
        }
        return bulls + "A" + cows + "B";
    }
}

