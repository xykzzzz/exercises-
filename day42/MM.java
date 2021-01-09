package offer;

import java.util.ArrayList;
import java.util.HashMap;

public class MM {
    //输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
    // 如果有多对数字的和等于S，输出两个数的乘积最小的
    //[1,2,4,7,11,15],15
    //[4,11]
    public static ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> a=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        if(array==null||array.length<=1){
            return a;
        }
        for (int i = 0; i < array.length; i++) {
            map.put(i,array[i]);
        }
        int res=array[array.length-1]*array[array.length-2];
        for (int i = 0; i < array.length; i++) {
            int target=sum-map.get(i);
            int mul=0;
            int j=i;
            while (j<array.length) {
                if (target == array[j]) {
                    mul = target * map.get(i);
                    if (mul <res) {
                        res = mul;
                        a.add(map.get(i));
                        a.add(target);
                       j++;
                    }else {
                        j++;
                    }
                }else {
                    j++;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        ArrayList<Integer> a = FindNumbersWithSum(arr, 21);
        String s = a.toString();
        System.out.println(s);
    }
}
