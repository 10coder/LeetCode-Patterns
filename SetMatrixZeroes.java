// https://leetcode.com/problems/set-matrix-zeroes/
public class SetMatrixZeroes {

    //Approach: traverse through the matrix and mark those rows and cols which needs to be turned zero at 0th row and 0th col.
    //Also have 2 variable flags to determine if 0th row and 0th col needs to be zeored
    //Time: O(mn)
    //Space: O(1)
    public void setZeroes(int[][] matrix) {
        boolean isr=false,isc=false;
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                if(i==0 && matrix[i][j]==0) {
                    isr=true;
                }
                if(j==0 && matrix[i][j]==0) {
                    isc=true;
                }
                if(i!=0 && j!=0 && (matrix[i][j]==0)) {
                    //if {
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                    //}
                }
            }

        }

        for(int i=1;i<matrix.length;i++) {
            for(int j=1;j<matrix[0].length;j++) {
                if(matrix[i][0]==0 || matrix[0][j]==0) {
                    matrix[i][j]=0;
                }
            }
        }

        // System.out.println(isr +"--- "+isc);

        if(isc) {
            int i=0;
            while(i<matrix.length) {
                matrix[i++][0]=0;
            }
        }

        if(isr) {
            int j=0;
            while(j<matrix[0].length) {
                matrix[0][j]=0;
                j++;
            }
        }
    }
}

//      Apporach: we keep track of all rows and cols to be updated to zeroes
//Space: O(m+n)
//Time: O(mn)
//         public void setZeroes(int[][] matrix) {
//         List<Integer> rows= new ArrayList<>();
//         List<Integer> cols = new ArrayList<>();
//         for(int i=0;i<matrix.length;i++) {
//             for(int j=0;j<matrix[0].length;j++) {
//                 if(matrix[i][j]==0) {
//                     rows.add(i);
//                     cols.add(j);
//                 }
//             }
//         }

//         for(int r: rows) {
//             for(int i=0;i<matrix[0].length;i++) {
//                 matrix[r][i]=0;
//             }
//         }

//         for(int c:cols) {
//             for(int i=0;i<matrix.length;i++) {
//                 matrix[i][c]=0;
//             }
//         }

//     }
// }

