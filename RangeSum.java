
//Question: https://leetcode.com/problems/range-sum-query-immutable/

public class RangeSum {


    int[] numPrefix;

    //Approach:
//    We are using prefix sum
//    for given array: a0 , a1, a2, a3
//    we form prefix sum: a0, a0+a1, a0+a1+a2, a0+a1+a2+a3
//
//    based on given index we subtract between those indicies

    public RangeSum(int[] nums) {
        numPrefix=new int[nums.length];
        numPrefix[0]=nums[0];
        for(int i=1;i<nums.length;i++) {
            numPrefix[i]=nums[i]+numPrefix[i-1];
        }
    }

    public int sumRange(int left, int right) {
        if(left==0) {
            return numPrefix[right];
        }
        return numPrefix[right]-numPrefix[left-1];
    }

    public static void main(String[] args) {
        RangeSum rs = new RangeSum(new int[]{-2, 0, 3, -5, 2, -1});

        System.out.println("expected: 1 output:" + rs.sumRange(0,2));
        System.out.println("expected: -1 output:" + rs.sumRange(2,5));
        System.out.println("expected: 3 output:" + rs.sumRange(0,5));

    }
}
