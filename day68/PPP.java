package 刷题;

public class PPP {
    public int countNumberOf2s(int n) {
        // write code here
        int count=0;
        int i;
        for (int j = 2; j <= n; j++) {
            i=j;
            while (i>0) {
                if(n%10==2){
                    count++;
                    i/=10;
                }
                if(i==0){
                    break;
                }
            }
        }
        return count;
    }
}
