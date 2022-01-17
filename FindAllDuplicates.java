import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class FindAllDuplicates {

    //Approach:
    // As given that numbers in array are postive and in the range of array.length
    //while iterating make the value at index as negative before making it negative check if it is already negative means
    // it is already visited hence the index would be duplicate value as it is already visited



    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            if(nums[Math.abs(nums[i])-1]<0) {
                res.add(Math.abs(nums[i]));
            } else {
                nums[Math.abs(nums[i])-1]*=-1;
            }
        }
        return res;
    }
}


//Similar would be the approach for finding all disappeared numbers in the array, while iterating make all values at the
// index as negatives and iterate through the array again to find all postive values and add the indexes into the result