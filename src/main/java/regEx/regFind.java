package regEx;

import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regFind {
    @Test
    public void regFindMatch() {
        Pattern pattern = Pattern.compile("America");
        Matcher match = pattern.matcher("America is a country located in North America content");
        while(match.find()) {
            System.out.println("pattern found from " + match.start()+ " to " + (match.end()-1));
        }
    }
}
//pattern found from 0 to 6
//pattern found from 38 to 44