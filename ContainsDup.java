import java.util.Arrays;

public class ContainsDup {

    //Sort and find if next element is same as this element
    //Time: O(nlogn)
    //Space O(1)
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<(nums.length-1);i++) {
            if(nums[i]==nums[i+1]) {
                return true;
            }
        }
        return false;
    }

    //We can also use a set and add all numbers and check the length to match
    //Time: O(n)
    //Space: O(n)

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,4,6,8,1}));
    }
}
