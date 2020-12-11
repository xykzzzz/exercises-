package 刷题;

import java.util.Scanner;

public class DDD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n=addAB(n1,n2);
        System.out.println(n);
    }
    public static int addAB(int A, int B) {
        // write code here
        if(B== 0) return A;
        int sum = A ^ B; // 各位相加，不计进位
        int carry = (A & B) << 1; // 记下进位
        return addAB(sum, carry);
    }
}
