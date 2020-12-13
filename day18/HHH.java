package 刷题;

/**
 * 输入人数循环变量，输入分数输入目标分数循环变量分数数组，
 * 计算和目标分数相等的分数出现的频次打印输出目标分数出现的频次
 */

import java.util.Scanner;

public class HHH {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int N = scan.nextInt();//输入的人数
             if(N==0) {//如果检测到输入的人数为0则结束
                return;
            }
            int[] arr = new int[N];//保存N个人的分数
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scan.nextInt();
            }
            int t = scan.nextInt();//目标分数输出击中目标分数的个数
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (t == arr[i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}