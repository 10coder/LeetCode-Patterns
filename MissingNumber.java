
import java.util.stream.IntStream;

public class MissingNumber {

        public static int missingNumber(int[] nums) {
            int res=0, i=0;
            for(i=0;i<nums.length;i++) {
                res = res^i^nums[i];
            }
            //since xor is done till n-1
            return res^i;
        }

    public static void main(String[] args) {
            int[] nums = IntStream.range(0,20).filter(x->x!=5).toArray();
        System.out.println(missingNumber(nums));
    }
}
