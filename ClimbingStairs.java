public class ClimbingStairs {

    public static int climbStairs(int n) {
        int[] mem=new int[n+1];
        for(int i=0;i<mem.length;i++) {
            mem[i]=-1;
        }
        mem[0]=0;
        return dp(n,mem);
    }

    public static int dp(int n, int[] mem) {
        if(mem[n]!=-1) {
            return mem[n];
        }
        if(n==1) {
            mem[n]=1;
            return mem[n];
        }
        if(n==2) {
            mem[n]=2;
            return mem[n];
        }
        mem[n]=dp(n-1,mem)+dp(n-2,mem);
        return mem[n];
    }

    public static void main(String[] args) {
        System.out.println("Expected 8: Output:"+climbStairs(5));
    }
}
