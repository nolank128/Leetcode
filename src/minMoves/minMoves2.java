package minMoves;

import java.util.Arrays;

class minMoves2 {
    public int minMoves2(int[] nums){
        if(nums==null||nums.length==0){return 0;}
        int min= Arrays.stream(nums).min().getAsInt();//获取数组最小值
        int l= 0;
        for (int num : nums) {
            l+= num - min;
        }
        return l;
    }
}
