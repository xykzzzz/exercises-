package offer;

import java.util.Arrays;

public class I {
    //输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
    // 使得所有的奇数位于数组的前半部分，
    // 所有的偶数位于数组的后半部分，并保证奇数和奇数，
    // 偶数和偶数之间的相对位置不变1,2,3,4,5,6,7]
    //[1,3,5,7,2,4,6]
    public static void reOrderArray(int [] array) {
        int []newArr=new int[array.length];
        int j=0;
        for (int i = 0; i < array.length; i++) {
            if((array[i]&1)!=0){
                newArr[j]=array[i];
                j++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if((array[i]&1)==0){
                newArr[j]=array[i];
                j++;
            }
            if(j==array.length){
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i]=newArr[i];
        }
    }
/*    public static void selectSort(int[]array){
        //将数组分为有序区间和无序
        //无序[0,arr.lenth-i)
        //有序[arr.Lenth-i,arr.lenth)
        for (int i = 0; i < array.length-1; i++) {
            int maxIndex=0;
            for (int j = 1; j <array.length-i ; j++) {
                if(array[maxIndex]<array[j]){
                    maxIndex=j;
                }
            }
            swap(array,maxIndex,array.length-i-1);
        }
    }

    public static void main(String[] args) {
        int []array={2,3,4,1,5,6,10,8};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }
    private static void swap(int[] array, int i, int j) {
        int t=array[i];
        array[i]=array[j];
        array[j]=t;
    }*/
public static void main(String[] args) {
    int []array={1,2,3,4,5,6,7};
    reOrderArray(array);
    System.out.println(Arrays.toString(array));
}
}
