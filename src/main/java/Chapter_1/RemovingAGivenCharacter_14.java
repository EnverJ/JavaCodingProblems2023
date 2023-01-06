package Chapter_1;

import java.util.regex.Pattern;

public class RemovingAGivenCharacter_14 {
    public static String removingCharacter(String str, char ch){
        return str.replaceAll(Pattern.quote(String.valueOf(ch)), "");
    }

    public static void main(String[] args) {
        System.out.println(removingCharacter("Snow ####",'#'));
        // regular expression is wrapped in the Pattern.quote() method.
    }
}
// output: snow