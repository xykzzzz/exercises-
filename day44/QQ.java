package offer;

public class QQ {
    public String ReverseSentence(String str) {
        if(str.length() == 0 || str == null){
            return "";
        }
        String[] s = str.split(" ");
        StringBuilder sb=new StringBuilder();
        for (int i = s.length-1; i >= 0; i--) {
            sb.append(s[i]);
            if(i!=0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
