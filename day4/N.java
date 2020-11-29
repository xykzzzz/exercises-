package 刷题;

import java.util.Scanner;

public class N {
    static int N;
    static int weight[];
    static int count;

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            N = sc.nextInt();
            for (int i = 1; i <= N; i++) {
                weight[i] = sc.nextInt();
                weight = new int[N + 1];
            }
            count(40,N);
            System.out.println(count);
        }
    }
    private static void count(int s, int n) {
        if(s==0){
            count++;
            return;
        }
        if(s<0||(s>0&&n<1)){
            return;
        }
        count(s-weight[n],n-1);
        count(s,n-1);
    }
}
