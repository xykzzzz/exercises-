package fuxi;

import java.util.Arrays;

public class AA {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child=0;
        int cook=0;
        while (child<g.length&&cook<s.length){
            if(g[child]<=s[cook]){
                child++;
            }
            cook++;
        }
        return child;
    }
}
