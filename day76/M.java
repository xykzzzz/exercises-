package fuxi;

public class M {
    public String reverseOnlyLetters(String S) {
        char[] chars = S.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            while (i < chars.length && !Character.isLetter(chars[i])) {
                i++;
            }
            while (j >= 0 && !Character.isLetter(chars[j])) {
                j--;
            }
            if (i < j) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
        }
        return new String(chars);
    }
}