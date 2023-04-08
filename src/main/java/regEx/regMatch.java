package regEx;

import org.testng.annotations.Test;

import java.util.regex.Pattern;

public class regMatch {
    @Test
    public  void ifMatch () {
        System.out.println(Pattern.matches("fre*domfor", "freedomfor"));
        System.out.println(Pattern.matches("free*oomFor","freedomFor"));
    }
}
