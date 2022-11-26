package Chapter_1;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateChar {
    public Map<Character, Integer> countDuplicateChar(String str){
        Map<Character, Integer> result=new HashMap<>();
        for(char ch: str.toCharArray()) {
            result.compute(ch,(k,v) -> (v == null)? 1: ++v);
        }
        return result;
    }

    public static void main(String[] args) {
        CountDuplicateChar cd=new CountDuplicateChar();
        System.out.println(cd.countDuplicateChar("Ezmet"));
    }


}
