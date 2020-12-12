package 刷题;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FFF {
    //3 3 1 1 2 3 4 5 6 3 2 1 2 3 4 5 6 2 2 1 1 1 1
    //1 4 2 5 3 6 1 5 4 3 2 6 1 1 1 1
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int groups = sc.nextInt();
            while (groups-- > 0){
                int n = sc.nextInt();
                int k = sc.nextInt();
                int[] res = new int[2*n];
                for(int i=0;i<2*n;i++){
                    int tmp = i + 1;
                    for(int j = 0; j < k;j++){
                        if (tmp <= n) tmp = 2*tmp - 1;
                        else tmp = 2 * (tmp - n);
                    }
                    res[tmp - 1]=sc.nextInt();
                }
                //输出
                if(res.length> 0) System.out.print(res[0]);
                for(int i = 1;i< 2*n;i++){
                    System.out.print(" "+res[i]);
                }
                System.out.println();
            }
        }
    }
/*    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int group=sc.nextInt();
        while (group-->0){
            int n=sc.nextInt();//代表每一侧分的牌数
            int k=sc.nextInt(); //代表一组牌洗了k次
            List<Integer> right=new ArrayList<>();
            List<Integer> left=new ArrayList<>();
            for (int i = 1; i <=2*n; i++) {
                if(i<=n){
                    int x=sc.nextInt();
                    left.add(x);
                }else{
                    int y=sc.nextInt();
                    right.add(y);
                }
            }
            while (k!=0){
                List<Integer> total= shuffler(left,right);
                k--;
                if(k==0){
                    for (int i = 0; i < total.size(); i++) {
                        int b=total.remove(0);
                        System.out.print(b+" ");
                    }
                    System.out.println();
                    return;
                }
                for (int i = 1; i <= total.size(); i++) {
                    if(i<=total.size()/2){
                        left.add(total.remove(0));
                    }else{
                        right.add(total.remove(0));
                    }
                }
            }
        }

    }

    private static List<Integer> shuffler(List<Integer> left, List<Integer> right) {
        int i=left.size()-1;
        int j=right.size()-1;
        List<Integer> total=new ArrayList<>();
        while (!(left.size()==0&&right.size()==0)){
            int x=right.remove(j);
            int y=left.remove(i);
            total.add(x);
            total.add(y);
            j--;
            i--;
        }
        List<Integer> newTotal=new ArrayList<>();
        for (int k = total.size()-1; k >=0; k--) {
            int a=total.remove(k);
            newTotal.add(a);
        }
        return newTotal;
    }*/
