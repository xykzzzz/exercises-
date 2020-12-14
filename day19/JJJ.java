package 刷题;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//[4,5,1,6,2,7,3,8],4
//[1,2,3,4]
public class JJJ {
    //topK问题
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res=new ArrayList<>();
        if(input.length==0||input==null||k==0||k>input.length){
            return res;
        }
       //使用快速排序
         quickSort(input,0,input.length-1);
        for (int i = 0; i < k; i++) {
            res.add(input[i]);
        }
        return res;
    }

    private static void quickSort(int[] a, int lowIndex, int highIndex) {
        if(highIndex-lowIndex+1<=1){
            return;
        }
        int key=partition(a,lowIndex,highIndex);
        quickSort(a,lowIndex,key-1);
        quickSort(a,key+1,highIndex);
    }

    private static int partition(int[] a, int lowIndex, int highIndex) {
        int left=lowIndex;
        int right=highIndex;
        int key=a[lowIndex];
        while (left<right){
            while (left<right&&key<=a[right]){
                right--;
            }
            while (left<right&&key>=a[left]){
                left++;
            }
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
        }
        int temp=a[left];
        a[left]=a[lowIndex];
        a[lowIndex]=temp;
        return left;
    }

}
