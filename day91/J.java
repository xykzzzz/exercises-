package 刷题1;

import java.util.Scanner;

public class J {
    //abcdefg
    //BCDEFGH

    //BCDEFGH
    //abcdefg
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        while (sc.hasNext()) {
            String p= sc.nextLine();
            if(i%2==0){
                //解密
                System.out.println(parsePassWord(p));
            }else{
                //加密
                System.out.println(parseCode(p));
            }
            i++;
        }
    }

    private static String parsePassWord(String password) {
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < password.length(); i++) {
            if(password.charAt(i)>='0'&&password.charAt(i)<='9'){
                char a=(char)(password.charAt(i)-1);
                if(a<'0'){
                    a='9';
                }
                sb.append(a);
            }else if(password.charAt(i)>='A'&&password.charAt(i)<='Z'){
                char b=Character.toLowerCase(password.charAt(i));
                b=(char)(b-1);
                sb.append(b);
            }else {
                char c=Character.toUpperCase(password.charAt(i));
                c=(char)(c-1);
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private static String parseCode(String code) {
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <code.length() ; i++) {
            if(Character.isDigit(code.charAt(i))){
                if(code.charAt(i)=='9'){
                    sb.append('0');
                }else {
                    sb.append(code.charAt(i) + '1');
                }
            } else if(code.charAt(i)>='A'&&code.charAt(i)<='Z'){
                char a=Character.toLowerCase(code.charAt(i));
                a=(char)(a+1);
                sb.append(a);
            }else {
                char b=Character.toUpperCase(code.charAt(i));
                b=(char)(b+1);
                sb.append(b);
            }
        }
        return sb.toString();
    }
}
