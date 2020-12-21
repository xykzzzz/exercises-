package offer;

public class F {
    public int JumpFloor(int target) {
        if(target==0||target==1){
            return 1;
        }
            return JumpFloor(target-1)+JumpFloor(target-2);
    }
}
