package regEx;

import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regEx {
    @Test
    public void findTheMatch() {
        String match_found = "Match Found";
        String match_not_found = "Match Not Found";
    Pattern pattern = Pattern.compile("EZO4School", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("Ezo4School is oen of the best programming school");
    boolean matchFound = matcher.find();
//    if(matchFound)
//
//    {
//        System.out.println("match Found");
//    } else
//
//    {
//        System.out.println("Match not found");
        System.out.println(matchFound?match_found:match_not_found);
}

}
