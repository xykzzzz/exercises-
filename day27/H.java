package offer;

public class H {
    public int Sum_Solution(int n) {
        boolean flag=n>1 && (n+=Sum_Solution(n-1))>0;
        return n;
    }
}
