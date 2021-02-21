package fuxi;

import java.util.ArrayList;
import java.util.List;

public class F {
    public boolean canConstruct(String ransomNote, String magazine) {
        List<Character> list=new ArrayList<>();
        for (int i = 0; i < magazine.length(); i++) {
            list.add(magazine.charAt(i));
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if(list.contains(ransomNote.charAt(i))){
                int i1 = list.indexOf(ransomNote.charAt(i));
                list.remove(i1);
            }else {
                return false;
            }
        }
        return true;
    }
}
