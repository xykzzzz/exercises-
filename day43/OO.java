package offer;

public class OO {
    public static int StrToInt(String str) {
        if (str == null || str.length() == 0)
            return 0;
        int flag = 1;
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && (str.charAt(i) == '+'|| str.charAt(i) == '-')) {
                flag = str.charAt(i) == '-' ? -1 : 1;
            }
            else if (str.charAt(i) > '0' && str.charAt(i) < '9') {
                sum = sum * 10 + str.charAt(i) - '0';
            }
            else {
                return 0;
            }
        }
        return flag * sum;
    }

    public static void main(String[] args) {
        System.out.println(StrToInt("1a33"));
    }
}
