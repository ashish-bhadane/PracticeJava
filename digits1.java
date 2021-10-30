public class DigPow {
  
    public static long digPow(int n, int p) {
        int sum = 0;
        for (char ch : Integer.toString(n).toCharArray()) {
            sum += Math.pow(Integer.parseInt(String.valueOf(ch)), p);
            p++;
        }
        if(sum%n==0){
            return sum/n;
        }
        else{
        return -1;}
    }
  
}
