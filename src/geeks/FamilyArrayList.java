package geeks;

import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

import java.util.ArrayList;
import java.util.Iterator;

public class FamilyArrayList {
    @Test
    public void family() {
        ArrayList<String> ls = new ArrayList<String>();
        ls.add("one");
        ls.add("two");
        ls.add("three");
        ls.stream().forEach(s -> System.out.println(s));
    }
}
