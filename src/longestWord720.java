import java.util.*;

public class longestWord720 {
    public static String longestWord(String[] words) {

        String res="";
        Set<String> set = new HashSet<>();
        set.add("");
        Arrays.sort(words, ( o1, o2)-> {
                    if(o1.length()!=o2.length()){
                        return o1.length()-o2.length();
                    }else{
                      return  o2.compareTo(o1);
                    }
            });
        for (int i = 0; i < words.length; i++) {
           String temp = words[i].substring(0,words[i].length()-1);
           if(set.contains(temp)){
              set.add(words[i]);
              res=words[i];
           }

        }


        return res;
    }

    public static void main(String[] args) {
        String[] words={"rac","rs","ra","on","r","otif","o","onpdu","rsf","rs","ot","oti","racy","onpd"};
        System.out.printf(longestWord(words));

    }

}
