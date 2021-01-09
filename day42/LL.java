package offer;

import java.util.ArrayList;

public class LL {
    ArrayList<ArrayList<Integer>> res=new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        for (int i = 1; i <sum ; i++) {
            int temp=0;
            int j=i;
            while (temp<sum){
                temp+=j;
                j++;
            }
            if(temp==sum){
                ArrayList<Integer> a=new ArrayList<>();
                for (int k = i; k <j ; k++) {
                    a.add(k);
                }
                res.add(a);
            }
        }
        return res;
    }
}
