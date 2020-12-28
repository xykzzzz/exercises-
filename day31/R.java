package offer;

import java.util.ArrayList;

public class R {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> res=new ArrayList<>();
        int col=matrix[0].length-1; int l=0; //r
        int row=matrix.length-1; int t=0; //b
        while (true) {
            for (int i=l;i<=col;i++){
                res.add(matrix[t][i]);
            }
            if(++t>row){
                break;
            }
            for (int i = t; i <=row ; i++) {
                res.add(matrix[i][col]);
            }
            if(l>--col){
                break;
            }
            for (int i = col; i >=l; i--) {
                res.add(matrix[row][i]);
            }
            if(t>--row) break;
            for(int i=row;i>=t;i--){
                res.add(matrix[i][l]);

            }
            if(++l>col) break;
        }
        return res;

    }
}
