package 刷题;

import java.math.BigInteger;
import java.util.*;

public class PP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int num=sc.nextInt();
            BigInteger[] numS=new BigInteger[num];
            for (int i = 0; i < num; i++) {
                numS[i]=sc.nextBigInteger();
            }
            Arrays.sort(numS);
            for (int i = 0; i < numS.length; i++) {
                System.out.println(numS[i]);
            }
        /*    List<Integer> list=new ArrayList<>();
            String [] str=new String[num];
            for (int i = 0; i < num; i++) {
                str[i]=sc.next();
               list.add(str[i].length());
            }
           for (int i = 0; i < str.length; i++) {
               Integer min = Collections.min(list);
               System.out.println(str[list.indexOf(min)]);
               list.set(list.indexOf(min),1001);
            }*/
        }
    }
}
