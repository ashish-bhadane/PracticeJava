public class Accumul {
    
    public static String accum(String s) {
        s = s.toUpperCase();
        String str ="";
        for(int i = 0; i< s.length();i++){
            str += String.valueOf(s.charAt(i));
            for(int j = 0;j<i;j++) {
                str += String.valueOf(s.charAt(i)).toLowerCase();
            }
            if(i!=s.length()-1) {
                str += "-";
            }
        }
        return str;
    }
}
