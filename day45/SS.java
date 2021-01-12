package offer;

import java.util.*;

public class SS {
    public boolean isContinuous(int [] numbers) {
        if(numbers.length != 5){
            return false;
        }
        int num=0;
        HashSet<Integer> hs=new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==0){
                num++;
            }else {
                hs.add(numbers[i]);
            }
        }
        if(num+hs.size()!=5){
            return false;
        }
        int max = Collections.max(hs);
        int min=Collections.min(hs);
        if(max-min<5){
            return true;
        }
        return false;
    }
}
