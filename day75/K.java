package fuxi;


public class K {
    public boolean isLongPressedName(String name, String typed) {
        int len1=name.length(),len2=typed.length();
        int index=0;
        int i=0,j=0;
        while(i<len1){
            index=1;
            while(i+1<len1&&name.charAt(i)==name.charAt(i+1)){
                i++;
                index++;
            }
            while(j<len2&&name.charAt(i)==typed.charAt(j)){
                index--;
                j++;
            }
            if(index>0)
                return false;
            i++;
        }
        return j==len2;
    }
}
