
import java.util.ArrayList;
import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=350 lang=java
 *
 * [350] 两个数组的交集 II
 */
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap map = new HashMap<Integer,Integer>();
        int num = -1;
        for(int i : nums1){
            if(!map.containsKey(i)){
                map.put(i, 1);
            }else{
                num = (int)map.get(i);
                map.put(i, ++num);
            }
        }

        ArrayList arrayList = new ArrayList<Integer>();
        for(int j : nums2){
            if(map.containsKey(j) && (num = (int)map.get(j)) > 0){
                arrayList.add(j);
                map.put(j, --num);
            }
        }
        int[] nums3 = new int[arrayList.size()];
        for(int k = 0; k < arrayList.size(); k++){
            nums3[k] = (int)arrayList.get(k);
        }
        return nums3;
    }
}

