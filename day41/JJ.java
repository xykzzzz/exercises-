package offer;

import java.util.HashMap;
import java.util.Map;

public class JJ {
    public int GetNumberOfK(int [] array , int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int a:array) {
          map.put(a,(map.getOrDefault(a,0)+1));
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i]==k){
                return map.get(array[i]);
            }
        }
        return 0;
    }
}
