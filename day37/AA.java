package offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class AA {
    public ArrayList<String> Permutation(String str) {
        char[] a=str.toCharArray();
            ArrayList<String> ans=new ArrayList<>();
            solve(ans,a,0,str.length());
            ans=new ArrayList<String>(new HashSet<>(ans));
        Collections.sort(ans);
            return ans;
    }

    private void solve(ArrayList<String> ans, char[] a, int index, int length) {
        if(index==length-1){
            String res=arrToStr(a);
            ans.add(res);
        }else {
            for (int i = index; i <length; i++) {
                char temp=a[i];
                a[i]=a[index];
                a[index]=temp;
                solve(ans,a,index+1,length);
                 temp=a[i];
                a[i]=a[index];
                a[index]=temp;
            }
        }
    }

    private String arrToStr(char[] a) {
        StringBuilder sb=new StringBuilder();
        for (char c:a) {
            sb.append(c);
        }
        return sb.toString();
    }
}
