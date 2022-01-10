//https://leetcode.com/problems/squares-of-a-sorted-array/
import java.util.Arrays;

public class SortedSquares {

    //Approach
    //We can solve by squaring all and sorting which takes O(nlogn)

    //Better approach is having 2 ptrs
    //strt and end ptr comparing squares with each other and filling the result array
    //O(n)

    //sqaring all positives and all negatives are corner cases as increasing order for neg cases is decreasing order of squares

    public static int[] sortedSquares(int[] nums) {
        int negPtr=0,posPtr=nums.length-1,resPtr=nums.length-1;
        int[] res=new int[nums.length];


        while(negPtr<=posPtr) {
            int negSqr=nums[negPtr]*nums[negPtr];
            int posSqr=nums[posPtr]*nums[posPtr];
            if(negSqr>posSqr) {
                res[resPtr--]=negSqr;
                negPtr++;
            } else  {
                res[resPtr--]=posSqr;
                posPtr--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Arrays.stream(sortedSquares(new int[] {-10,-4,-3,-1,0})).forEach(System.out::println);
    }
}
