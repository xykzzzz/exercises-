package fuxi;

import java.util.Arrays;

public class N {
    public static int[] sortArrayByParity(int[] A) {
        int[] newTemp=new int[A.length];
        int j=A.length-1;
        int index=0;
        for (int i = 0; i < A.length; i++) {
            if(A[i]%2==0){
                newTemp[index]=A[i];
                index++;
            }else {
                newTemp[j]=A[i];
                j--;
            }
        }
        return newTemp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{3, 1, 2, 4})));
    }
}
