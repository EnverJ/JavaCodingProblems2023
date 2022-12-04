package Chapter_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class countStringInString_17 {
    public static int countStringInString(String str, String toFind){
        Pattern pa=Pattern.compile(Pattern.quote(toFind));
        Matcher matcher=pa.matcher(str);

        int position = 0;
        int count = 0;
        while (matcher.find(position)) {
            position = matcher.start() + 1;
            count++;

        }
        return count;
    }

    public static void main(String[] args) {
        int num=countStringInString("JavaScript","Java");
        System.out.println(num);
                }
}
// output: 1