package 刷题;

import java.util.HashMap;
import java.util.Map;

public class P {
    public int getValue(int[] gifts, int n) {
        // write code here
        Map<Integer,Integer> map=new HashMap<>();
        for (int x:gifts) {
            map.put(x,(map.getOrDefault(x,0)+1));
        }
        for (int i = 0; i < n; i++) {
            if(map.get(gifts[i])>n/2){
                return gifts[i];
            }
        }
        return 0;
    }
}
