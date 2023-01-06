package Chapter_1;

import java.util.stream.IntStream;

public class isPalindrome_11 {
    public static boolean isPalindrome(String str){
     return   IntStream.range(0,str.length()/2)
                .noneMatch(p -> str.charAt(p) !=
                        str.charAt(str.length() - p - 1));
    }
 // a palindrome (whether a string or number)  looks unchanged when it's reversed.
    public static void main(String[] args) {
        System.out.println(isPalindrome("moom"));
    }
}
// output:  true