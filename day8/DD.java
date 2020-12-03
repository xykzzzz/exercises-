package 刷题;

import java.util.Arrays;
import java.util.Scanner;

//3 9 6 8 -10 7 -11 19 30 12 23 5
//-11 -10 3 6 7
public class DD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s=sc.nextLine();
            String[] s1 = s.split(" ");
            int[]num=new int[s1.length-1];
            for (int i = 0; i < s1.length - 1; i++) {
                num[i]=Integer.parseInt(s1[i]);
            }
            int k=Integer.parseInt(s1[s1.length-1]);
            int lowIndex=0;
            int highIndex=num.length-1;
            int index=partition(num,lowIndex,highIndex);
            while (index!=k){
                if(index>k){
                    highIndex=index-1;
                    index=partition(num,lowIndex,highIndex);
                }else{
                    lowIndex=index+1;
                    index=partition(num,lowIndex,highIndex);
                }
            }
            Arrays.sort(num,0,k);
            for (int i = 0; i < k; i++) {
                    System.out.print(i==k-1?num[i]:num[i] + " ");

            }
        }
    }

    public static int partition(int[] num, int lowIndex, int highIndex) {
        int left=lowIndex;
        int right=highIndex;
        int key=num[lowIndex];
        while (left<right){
            while (left<right&&num[right]>=key){
                right--;
            }
            while (left<right&&num[left]<key){
                left++;
            }
            swap(num,left,right);
            left++;
            right--;
        }
        swap(num,lowIndex,left);
        return left;
    }

    private static void swap(int[] num, int i, int j) {
        int temp=num[i];
        num[i]=num[j];
        num[i]=temp;
    }
}
