/*
 * @lc app=leetcode.cn id=210 lang=java
 *
 * [210] 课程表 II
 */

// @lc code=start
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
         /**
         * 我们在算法中学习的拓扑排序一般是这样讲的：
         * 1.找入度为0的这个节点
         * 2.去除该结点，并将该节点可到达的节点的入度-1
         * 3.寻找下一个入度为0的节点。
         */

        //存放该节点可到达的节点
        List<Integer>[] list = new LinkedList[numCourses];
        for(int i = 0; i < list.length; i++){
            list[i] = new LinkedList<>();
        }
        //统计每个节点的入度
        int[] degree = new int[numCourses];
        //初始化邻接矩阵和入度
        for (int[] prerequisite : prerequisites) {
            degree[prerequisite[0]]++;
            list[prerequisite[1]].add(prerequisite[0]);
        }
        //然后就开始主过程
        List<Integer> temp = new ArrayList<>();
        while(temp.size() != numCourses){
            int i = 0;
            for(; i < numCourses; i++){
                if(degree[i] == 0){
                    break;
                }
            }
            //如果找到越界都找不到，说明存在环，提前结束
            if(i == numCourses){
                break;
            }
            //将该节点入度置-1，表示已经访问过了
            degree[i] = -1;
            //加入到答案list中
            temp.add(i);
            //将该节点能到达的节点的度数减一
            while (!list[i].isEmpty()){
                degree[list[i].remove(0)]--;
            }

        }
        //这个情况就是存在环，直接返回空数组
        if(temp.size() < numCourses){
            return new int[0];
        }
        //将list中的数据导入数组中
        int[] res = new int[numCourses];

        for (int i = 0; i < temp.size(); i++){
            res[i] = temp.get(i);
        }

        return res;
    }
}
// @lc code=end

