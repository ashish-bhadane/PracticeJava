
1
class Solution {
2
    public static String whoLikesIt(String... names) {
3
        String[] namesArray = names;
4
        if(namesArray.length==0){
5
          return "no one likes this";
6
         }
7
          else if (namesArray.length==1){
8
          return namesArray[0] + " likes this";
9
          }
10
          else if (namesArray.length==2){
11
          return namesArray[0] + " and " + namesArray[1] + " like this";
12
          }
13
          else if (namesArray.length==3){
14
          return namesArray[0] + ", " + namesArray[1] + " and " + namesArray[2] + " like this";
15
            }
16
          else if (namesArray.length >= 4){
17
          return namesArray[0] + ", " + namesArray[1] + " and " + String.valueOf(namesArray.length-2) + " others like this";
18
            }
19
      return "";
20
        }
21
      
22
    }
 Correct! Y
