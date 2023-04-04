package sum;

import java.util.HashMap;

public class sum2 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map =new HashMap<>();
        for (int i=0;i< nums.length;i++){
            int sub=target- nums[i];
            if (map.containsKey(sub))
                return new int[]{i, map.get(sub)};
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("no,two sum solution");
    }
}
