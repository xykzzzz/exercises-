package offer;

public class EEE {
    /**
     * target 1 0
     *        2 2
     */
    public static int cutRope(int target) {
        if(target<=1){
            return 0;
        }
        if(target==2){
            return 1;
        }
        if(target==3){
            return 2;
        }
        int len=target%3==0?target/3:target/3+1;
        int len2=0;
        if(target%3==0){
            len2=0;
        }
        if(target%3==1){
            len2=target%3+1;
        }
        if(target%3==2){
            len2=1;
        }
        return (int)(Math.pow(2,len2)*Math.pow(3,len-len2));
    }

    public static void main(String[] args) {
        System.out.println(cutRope(14));
    }
}
