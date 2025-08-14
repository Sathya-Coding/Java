import java.util.*;

public class groupanagram {
    public static void main(String[]args){
        String[]words={"bat","tab","cat","act","tac","dog"};
        Map<String,List<String>>
                map=new HashMap<>();
        for(String word:words){
            char[]chars=word.toCharArray();
            Arrays.sort(chars);
            String keys=new String(chars);
            map.putIfAbsent(keys,new ArrayList<>());
            map.get(keys).add(word);
        }
        for(List<String>group: map.values()){
            System.out.println(group);
        }
    }
}
