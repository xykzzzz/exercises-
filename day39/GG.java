package offer;

import java.util.HashMap;
import java.util.Map;

public class GG {
/*    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int res=array[0];
        for (int i = 1; i <array.length; i++) {
            res^=array[i];
        }
        int pos=0; //找到其第一个为1的位
        for(;pos<32;pos++){
            if(((res>>pos) & 1)==1)
                break;
        }
        int x=0;
        int y=0;
        for (int i = 0; i < array.length; i++) {
            if(((array[i]>>pos)&1)==1){
                x^=array[i];
            } else {
                y^=array[i];
            }
        }
        num1[0]=x;
        num2[0]=y;
    }*/
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i],(map.getOrDefault(array[i],0)+1));
        }
        int x=0;
        int y=0;
        for (int a:array) {
            if(map.get(a)==1&&x==0){
                x=a;
                continue;
            }
            if(map.get(a)==1&&x!=0){
                y=a;
            }
        }
        num1[0]=x;
        num2[0]=y;
    }
}
