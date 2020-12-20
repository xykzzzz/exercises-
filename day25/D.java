package offer;

import java.util.Deque;
import java.util.LinkedList;

//把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
//输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
//NOTE：给出的所有元素都大于0，若数组大小为0，请返回0
//[3,4,5,1,2]
//1
public class D {
    public int minNumberInRotateArray(int [] array) {
        if(array.length==0){
            return 0;
        }
        int target=array[0];
        for (int i = 1; i < array.length; i++) {
            if(target>array[i]){
                target=array[i];
            }else{
                continue;
            }
        }
        return target;
    }
}
