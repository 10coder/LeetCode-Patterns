//https://leetcode.com/problems/two-sum/submissions/

import java.util.HashMap;
import java.util.Map;

public class TwoPointers {

    //Using hashmap
    //Time O(n) and space O(n)
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> valInd = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(valInd.containsKey(nums[i])) {
                return new int[]{i,valInd.get(nums[i])};
            }
            valInd.put(target-nums[i],i);
        }
        return new int[]{};
    }
}
