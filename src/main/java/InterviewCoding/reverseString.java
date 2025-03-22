package InterviewCoding;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class reverseString {
    public static void revString() {
        String name = "Testing";
        StringBuilder ReverseSt = new StringBuilder(name).reverse();
        System.out.println(ReverseSt);
    }

    public static void ForLoopReverseSt() {
        String name = "Testing Selenium Selenium";
        String[] name2 = name.split(" ");
        //    List<String> newName= new ArrayList<>();
        Set<String> newSet = new HashSet<>();
        for (int i = name2.length - 1; i >= 0; i--) {
            newSet.add(name2[i]);

        }
        String finalValue = String.join(" ", newSet);
        System.out.println(finalValue);
        //   System.out.println(newName.stream().collect(Collectors.joining("")));
    }

    public static void removeDuplicatedWords() {


        // remove duplicated words from string
        String name3 = "selenium java selenium IT i love IT";
        String[] words = name3.split(" ");
        Set<String> uniqueWords = new LinkedHashSet<>();
        for (String value : words) {
            uniqueWords.add(value);
        }
        //String myResult= uniqueWords.stream().collect(Collectors.joining(" "));
        String result = String.join(" ", uniqueWords);
        System.out.println(result);
    }


    public static void main(String[] args) {
        //   revString();
        //    ForLoopReverseSt();
        removeDuplicatedWords();


    }
}
