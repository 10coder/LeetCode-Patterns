public class SingleNumber {

    public static int singleNumber(int[] nums) {
        //Time O(n)
        //Space O(1)
        // if we xor all duplicates are vanished and missing duplicate is found
        int res=0;
        for(int i=0;i<nums.length;i++) {
            res=res^nums[i];
        }
        return res^0;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
    }
}
