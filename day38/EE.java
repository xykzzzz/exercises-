package offer;

public class EE {
    public String PrintMinNumber(int [] numbers) {
        if(numbers.length==0||numbers==null){
            return "";
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j <numbers.length ; j++) {
                int sum1=Integer.parseInt(numbers[i]+""+numbers[j]);
                int sum2=Integer.parseInt(numbers[j]+""+numbers[i]);
                if(sum1>sum2){
                    int temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i]);
        }
        return sb.toString();
    }
}
