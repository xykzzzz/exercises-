package fuxi;

import java.util.ArrayList;
import java.util.Arrays;

public class A2 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res=new ArrayList<>();
        if(input.length==0||input==null||k==0||k>input.length){
            return res;
        }
        quickSort(input,0,input.length-1);
        for (int i = 0; i < k; i++) {
            res.add(input[i]);
        }
        return res;
    }

    private void quickSort(int[] input, int lowIndex, int highIndex) {
        if(highIndex-lowIndex+1<=1){
            return;
        }
        int key=partition(input,lowIndex,highIndex);
        quickSort(input,lowIndex,key-1);
        quickSort(input,key+1,highIndex);
    }

    private int partition(int[] input, int lowIndex, int highIndex) {
        int left=lowIndex;
        int right=highIndex;
        int key=input[lowIndex];
        while (left<right){
            while (left<right&&input[right]>=key){
                right--;
            }
            while (left<right&&input[left]<=key){
                left++;
            }
            int temp=input[left];
            input[left]=input[right];
            input[right]=temp;
        }
        int temp=input[left];
        input[left]=input[lowIndex];
        input[lowIndex]=temp;
        return left;
    }
}
