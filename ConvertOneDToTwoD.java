//https://leetcode.com/problems/convert-1d-array-into-2d-array/
public class ConvertOneDToTwoD {

    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] res=new int[m][n];
        if(m*n != original.length) {
            return new int[][]{};
        }
        int x=0;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                res[i][j]=original[x++];
            }
        }
        return res;
    }
//
//    Best Answer:
//    https://leetcode.com/problems/convert-1d-array-into-2d-array/discuss/1499046/Java-O(N)
}
