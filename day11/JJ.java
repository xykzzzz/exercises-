package 刷题;

import java.util.Arrays;

public class JJ {
    public static int[] multiply(int[] A) {
        int len=A.length;
        int []B=new int[len];
        for (int i = 0; i < len; i++) {
            int res=1;
            for (int j = 0; j < len; j++) {
                if(i==j){
                    continue;
                }else{
                    res=res*A[j];
                }
            }
            B[i]=res;
        }
        return B;
    }

    public static void main(String[] args) {
        int []A={1,2,3,4,5};
        int[] multiply = multiply(A);
        System.out.println(Arrays.toString(multiply));
    }
}
