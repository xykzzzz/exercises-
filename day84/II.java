package fuxi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class II {
    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if(A[i]<0&&K>0){
                A[i]=-A[i];
                K--;
            }
        }
        Arrays.sort(A);
        if((K>0&&K%2==0)||K==0){
            int sum=0;
            for (int i = 0; i < A.length; i++) {
                sum=sum+A[i];
            }
            return sum;
        }else if(K>0&&K%2!=0) {
            int sum=0;
            for (int i = 1; i <A.length ; i++) {
                sum=sum+A[i];
            }
            return sum-A[0];
        }
        return -1;
    }
}
