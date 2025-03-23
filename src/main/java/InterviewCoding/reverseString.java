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


    public static String arthStringCalculation() {
        String num1 = "123";
        String num2 = "2598";

        int n1 = num1.length();
        System.out.println("n1 value is: " + n1);
        int n2 = num2.length();
        System.out.println("n2 value is: " + n2);
        int maxLen = Math.max(n1, n2);
        System.out.println("MacLen number is: " + maxLen);


        StringBuilder result = new StringBuilder();
        int carry = 0;

        for (int i = 0; i < maxLen; i++) {
            int digit1 = (n1 - 1 - i >= 0) ? num1.charAt(n1 - 1 - i) - '0' : 0;
            int digit2 = (n2 - 1 - i >= 0) ? num2.charAt(n2 - 1 - i) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;

            result.append(sum % 10);
        }

        if (carry != 0) {
            result.append(carry);
        }

        result.reverse();
        return result.toString();  // 🔁 Now it returns the sum
    }


    public static void main(String[] args) {
        String sum = arthStringCalculation();
        System.out.println("Sum: " + sum);
        //   revString();
        //    ForLoopReverseSt();
        // removeDuplicatedWords();

    }
}









