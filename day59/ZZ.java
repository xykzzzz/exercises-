package 刷题;

public class ZZ {
      int cns;
    //[1,2,3,4,5,6,7,0]  7

    public  int InversePairs(int[] array) {
        if(array.length!=0) {
            mergeSort(array,0,array.length-1);
        }
        return cns;
    }

    private  void mergeSort(int[] array, int lowIndex, int highIndex) {
        if(lowIndex>=highIndex){
            return;
        }
        int middleIndex=lowIndex+(highIndex-lowIndex)/2;
        mergeSort(array,lowIndex,middleIndex);
        mergeSort(array,middleIndex+1,highIndex);
        help(array,lowIndex,middleIndex,highIndex);
    }

    private  void help(int[] array, int lowIndex, int middleIndex, int highIndex) {
        int left=lowIndex;
        int right=middleIndex+1;
        int k=0;
        int[] temp=new int[highIndex-lowIndex+1];
        while (left<=middleIndex&&right<=highIndex&&left<right){
            if(array[left]<=array[right]){
                temp[k++]=array[left++];
            }else {
                temp[k++]=array[right++];
                cns=(cns+middleIndex-left+1)%1000000007;
            }
        }
        while (left<=middleIndex){
            temp[k++]=array[left++];
        }
        while (right<=highIndex){
            temp[k++]=array[right++];
        }
        for (int i = 0; i < temp.length; i++) {
            array[i+lowIndex]=temp[i];
        }
    }
/*    public static void main(String[] args) {
        int[]a={1, 2, 3, 4, 5, 6, 7, 0};
        int i = InversePairs(a);
        System.out.println(i);
    }*/

}
