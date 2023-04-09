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

//Pattern Found in 0 to 1
//Pattern Found in 5 to 6
    @Test
    public void regSplit () {
        String text = "I1Parked2My3Car4In5My6Garage7.";
        String delimiter = "\\d";
        Pattern pattern = Pattern.compile(delimiter, Pattern.CASE_INSENSITIVE);
        String[] result = pattern.split(text);
        //iterating using foreach loop
        for (String tem: result
             ) {
            System.out.println(tem);
        }

    }
}