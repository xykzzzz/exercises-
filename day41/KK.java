package offer;

public class KK {
    //在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
    // 输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。
    // 即输出P%1000000007
    //[1,2,3,4,5,6,7,0]
    //7
    private int cns;
    public int InversePairs(int [] array) {
        mergeSortInternal(array,0,array.length);
        return cns;
    }

    private void mergeSortInternal(int[] array, int lowIndex, int highIndex) {
        int size=highIndex-lowIndex;
        if(size<=1){
            return;
        }
        int middleIndex=(lowIndex+highIndex)/2;
        mergeSortInternal(array,lowIndex,middleIndex);
        mergeSortInternal(array,middleIndex,highIndex);
        MergeOne(array,lowIndex,middleIndex,highIndex);
    }

    private void MergeOne(int[] array, int lowIndex, int middleIndex, int highIndex) {
        int size=highIndex-lowIndex;
        int []extraArray=new int[size];
        int leftIndex=lowIndex;
        int rightIndex=middleIndex;
        int extraIndex=0;
        while (leftIndex<middleIndex&&rightIndex<middleIndex){
            if(array[leftIndex]<array[rightIndex]){
                extraArray[extraIndex]=array[leftIndex];
                extraIndex++;
                leftIndex++;
            }else {
                extraArray[extraIndex]=array[rightIndex];
                extraIndex++;
                rightIndex++;
                cns=(cns+(middleIndex-leftIndex+1))%1000000007;
            }
        }
        if(leftIndex<middleIndex) {
            while (leftIndex < middleIndex) {
                extraArray[extraIndex++] = array[leftIndex++];
            }
        }else{
            while (rightIndex < highIndex) {
                extraArray[extraIndex++] = array[rightIndex++];
            }
        }
        for (int i = 0; i < size; i++) {
            array[i+lowIndex] = extraArray[i];
        }
    }
}
