package offer;


public class V {
    public static int FindGreatestSumOfSubArray(int[] array) {
        //1,-2,3,10,-4,7,2,-5
      int maxSum=array[0];
      int sum=0;
        for (int i = 0; i < array.length; i++) {
            if(sum<=0){
                sum=array[i];
            }else {
                sum=sum+array[i];
            }
            if(maxSum<sum){
                maxSum=sum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] a={1,-2,3,10,-4,7,2,-5};
        int i = FindGreatestSumOfSubArray(a);
        System.out.println(i);
    }
}
