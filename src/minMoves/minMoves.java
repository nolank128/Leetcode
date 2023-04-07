package minMoves;

import java.util.Arrays;

class minMoves {
    public int minMoves(int[] nums){
        if (nums==null||nums.length==0){
            return 0;
        }
        int l=0;
        Arrays.sort(nums);//从小到大排序。
        for (int i=0;i<nums.length;i++){
            int n=nums[i];
            l+=n-nums[0];
            /*n-1个元素加一，逆向一下，也就是相当于将一个元素减少1，让数组相等。
            * 举个例子
            * [1,2,3]
            * i=0;l=0
            * i=1;l=1;
            * i=2;l=1+2=3;
            * */
        }
        /*采用迭代器
        for(int num:nums){
        l+=n-nums[0];
        }
         */
        return l;
    }
}
