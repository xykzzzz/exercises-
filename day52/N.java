package 刷题;

import java.util.Arrays;

public class N {
    public static boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean[] res=new boolean[n];
        for (int i = 0; i < n; i++) {
            res[i]=s.contains(p[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        String[]p={"a","b","c","d"};
        int n=p.length;
        String s="abc";
        boolean[] booleans = chkSubStr(p, n, s);
        System.out.println(Arrays.toString(booleans));
    }
}
