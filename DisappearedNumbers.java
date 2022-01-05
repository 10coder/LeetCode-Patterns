import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        //We can use directed graph to do it in O(n) without extra space
        int i=1;
        List<Integer> res = new ArrayList<>();
        while(i<=nums.length) {
            int next=nums[i-1];
            while(next!=0 && nums[next-1]!=0) {
                int tmp=nums[next-1];
                nums[next-1]=0;
                next=tmp;
            }
            i++;
        }

        for(i=0;i<nums.length;i++) {
            if(nums[i]!=0) {
                res.add(i+1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}).stream().forEach(System.out::println);
    }
}
