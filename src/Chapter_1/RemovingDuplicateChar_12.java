package Chapter_1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemovingDuplicateChar_12 {
    public static String RemoveDuplicate(String str){
       return Arrays.asList(str.split(" ")).stream()
                .distinct()
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(RemoveDuplicate("Google is Google"));
    }
}
// output: Gogle