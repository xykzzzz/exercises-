package 刷题;

public class QQQ {
    public static void main(String[] args) {
        long n=30; //表示天数
        long my=meMoney(n);
        long fu=10*n;
        System.out.print(fu+" "+my);
    }

    private static long meMoney(long n) {
        if(n==1){
            return (int)Math.pow(2,0);
        }
        if(n>1){
            long res=0;
            res=res+(long)Math.pow(2,n-1)+meMoney(n-1);
            return res;
        }
        return 0;
    }
}
