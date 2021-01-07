package offer;

import java.util.HashMap;
import java.util.Map;

public class HH {
    public int FirstNotRepeatingChar(String str) {
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c:chars) {
            map.put(c,(map.getOrDefault(c,0)+1));
        }
        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i])==1){
                return i;
            }
        }
        return -1;
    }
}
