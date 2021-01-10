package offer;

public class NN {
    public String LeftRotateString(String str,int n) {
        if(n > str.length())
            return str;
        String newStr1=str.substring(0,n);
        String newStr2=str.substring(n,str.length());
        return newStr2+newStr1;
    }
}
