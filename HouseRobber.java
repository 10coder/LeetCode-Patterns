//https://leetcode.com/problems/house-robber/submissions/
import java.util.Arrays;

public class HouseRobber {
    //Using DP
    // I can take max value formed from position 0 or 1
    // at every position i can add positions value and either of other values skipped by 1 or 2
    //used memoization reduce overlapping
    public int rob(int[] nums) {
        int[] mem=new int[nums.length];
        Arrays.fill(mem,-1);
        if(nums.length==1) return nums[0];
        return Math.max(robHouse(nums,mem,0),robHouse(nums,mem,1));
    }

    public int robHouse(int[] nums, int[] mem, int pos) {
        if(pos<nums.length) {
            if(mem[pos]!=-1) {
                return mem[pos];
            }
            mem[pos]=nums[pos]+Math.max(robHouse(nums,mem,pos+2),robHouse(nums,mem,pos+3));
            return mem[pos];
        }
        return 0;
    }

}
