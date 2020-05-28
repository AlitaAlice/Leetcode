package 两数之和;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class  Solution

{
    public int [] twoSum(int[] nums,int target)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target-nums[i]))
            {
                return new int[]{map.get(nums[i]),i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

}
