package fuxi;

public class G {
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String s= String.valueOf(x);
        int j=s.length()-1;
        int i=0;
        while (i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
    }
}
