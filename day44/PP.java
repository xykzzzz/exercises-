package offer;

import java.util.HashMap;
import java.util.Map;

public class PP {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers==null||length==0){
            duplication[0]=-1;
            return false;
        }
        Map<Integer,Integer> map=new HashMap<>();
        for (int x:numbers) {
            map.put(x,(map.getOrDefault(x,0)+1));
        }
        for (int i = 0; i < numbers.length; i++) {
            if(map.get(numbers[i])>1){
                duplication[0]=numbers[i];
                return true;
            }
        }
        return false;
    }
}
