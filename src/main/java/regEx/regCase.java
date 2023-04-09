package regEx;

import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regCase {
    @Test
    public void regCaseInsensitive() {
        Pattern pattern = Pattern.compile("ez*", Pattern.CASE_INSENSITIVE);
        Matcher m = pattern.matcher("EzForEz");

        while (m.find()) {
            System.out.println("Pattern Found in " + m.start() + " to " + (m.end() - 1));
        }
    }
}
//Pattern Found in 0 to 1
//Pattern Found in 5 to 6