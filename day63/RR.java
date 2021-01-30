package 刷题;

import java.util.Scanner;

public class RR {
    //给定一个有n个正整数的数组A和一个整数sum,求选择数组A中部分数字和为sum的方案数。
    //当两种选取方案有一个数字的下标不一样,我们就认为是不同的组成方案
    //5 15 5 5 10 2 3
    //4
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int sum=sc.nextInt();
        int[] arr=new int[len];
        for (int i = 0; i < len; i++) {
            arr[i]=sc.nextInt();
        }
        long res=method(arr,sum,len);
        System.out.println(res);
    }

    private static long method(int[] arr, int sum, int n) {
        long dp[]=new long[sum+1];
        dp[0]=1;
        int i,j;
        for(i=0;i<n;i++){
            for(j=sum;j>=arr[i];j--){
                dp[j]=dp[j-arr[i]]+dp[j];
            }
        }
        return dp[sum];
    }
}
