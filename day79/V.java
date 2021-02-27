package fuxi;

public class V {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(Character.isLetterOrDigit(chars[i])){
                sb.append(chars[i]);
            }
        }
        int n=sb.length();
        int i=0;
        int j=n-1;
        while (i<j){
            if(Character.toLowerCase(sb.charAt(i))!=Character.toLowerCase(sb.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
