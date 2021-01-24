package 刷题;


import java.util.Scanner;

//
//小易经常沉迷于网络游戏.有一次,他在玩一个打怪升级的游戏,他的角色的初始能力值为a
// 在接下来的一段时间内,他将会依次遇见n个怪物,每个怪物的防御力为b1,b2,b3...bn.
// 如果遇到的怪物防御力bi小于等于小易的当前能力值c,那么他就能轻松打败怪物,
// 并且使得自己的能力值增加bi;如果bi大于c,
// 那他也能打败怪物,但他的能力值只能增加bi与c的最大公约数.
// 那么问题来了,在一系列的锻炼后,小易的最终能力值为多少?
//3 50
//50 105 200
//5 20
//30 20 15 40 100
//输出 110
//     205
public class X {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int num=sc.nextInt();
            int power=sc.nextInt();
            int []numS=new int[num];
            for (int i = 0; i < num; i++) {
                numS[i]=sc.nextInt();
            }

            for (int i = 0; i < num; i++) {
                if(power>=numS[i]){
                    power=power+numS[i];
                }else {
                    power=power+help(power,numS[i]);
                }
            }
            System.out.println(power);
        }
    }

    private static int help(int m, int n) {
        int c=0;
        int a=m;
        int b=n;
        while (b!=0){
            c=a%b;
            a=b;
            b=c;
        }
        return a;
    }
}
