package 刷题;

import java.util.Scanner;
public class EEE {
    public static final long LIMIT = 300000;//最多搜索次数
    public static final long N = 1000000007;//求余

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            System.out.println(sol(sc.nextLong()));
        }
    }
    public static long sol(long in){
        if(in == 0){
            return 0L ;
        }else{
            return search(in);
        }
    }
    public static long search(long in){//参数：初始坐标
        long temp = in;
        for(int i=1;i<=LIMIT;i++){
            temp = (temp * 2 + 1 ) % N;
            if( temp % N == 0 ){
                for(int j =0;j<=(i / 2);j++){
                    if((i - 2*j) % 3 == 0){
                        return ((i+j)/3);
                    }
                }
            }
        }
        return -1L;
    }
}
