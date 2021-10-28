public class DuplicateEncoder {
  static String encode(String word){
    word = word.toLowerCase();
        String str = "";
        boolean flag = false;
        for (int i = 0; i < word.length(); i++) {
            if(i == word.length()-1 && word.substring(0,i).contains(Character.toString(word.charAt(i)))){
                str = str + ")";
                break;
            }
            for (int j = i+1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j) || word.substring(0,i).contains(Character.toString(word.charAt(i)))) {
                    flag = true;
                    break;
                }
            }
            if(flag){
                str = str + ")";
                flag = false;
            }
            else{str = str + "(";
            System.out.println(str);};
        }
        return str;
    }
}
