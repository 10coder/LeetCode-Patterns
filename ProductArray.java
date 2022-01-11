import java.util.Arrays;

public class ProductArray {

    //we do left to right product and store previous elements product in current index
    //we need to do product from right and multiply with current value
    //O(n)
    //[1            2        3       4     5]
    //[1            1       1*2    1*2*3 1*2*3*4]
    //[*2*3*4*5   *3*4*5    *4*5   *5      *1 ]
    public static int[] productExceptSelf(int[] nums) {
        int[] res=new int[nums.length];
        res[0]=1;
        //left to right product
        for(int i=1;i<nums.length;i++) {
            res[i]=res[i-1]*nums[i-1];
        }

        int pro=1;
        //right to left product
        for(int i=nums.length-1;i>=0;i--) {
            res[i]*=pro;
            pro*=nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("120,60,40,30,24 Expected " );
         Arrays.stream(productExceptSelf(new int[]{1,2,3,4,5})).forEach(x->System.out.print(x+" "));
    }
}
