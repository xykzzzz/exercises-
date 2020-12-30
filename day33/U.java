package offer;

public class U {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0){
            return false;
        }
        return BSTInternal(sequence,0,sequence.length-1);
    }

    private boolean BSTInternal(int[] sequence, int left, int right) {
        if(left>=right){
            return true;
        }
        int index=left;
        while (sequence[index]<sequence[right]){
            index++;
        }
        int midIndex=index;
        while (sequence[index]>sequence[right]){
            index++;
        }
        return (index==right)&&BSTInternal(sequence,left,midIndex-1)&&BSTInternal(sequence,midIndex,right-1);
    }
}
