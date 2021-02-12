package 刷题;

public class TTT {
    public boolean match(char[] str, char[] pattern)
    {
        String res = String.valueOf(pattern);
        String s = String.valueOf(str);
        return s.matches(res);
    }
}
