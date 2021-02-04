package 刷题;

public class YYY {
    public int  countWays(int n){
        int a = 1,b = 2,c = 4;
        if (n== 1){
            return a;
        }else if (n == 2){
            return b;
        }else if (n == 3){
            return c;
        }else {
            for (int i = 4 ;i <= n;i++){
                int temp = ((a+b)%1000000007+c)%1000000007;
                a = b;
                b = c;
                c = temp;
            }
            return c;
        }
    }
}
