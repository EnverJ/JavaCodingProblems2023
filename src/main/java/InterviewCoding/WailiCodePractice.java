package InterviewCoding;

import java.util.*;

public class WailiCodePractice {


    public static void Reverse(){
        String name = "Testing";
        String [] name1 = name.split("");
        List<String > newName =  new ArrayList<>();
        for(int i =name.length()-1; i>=0; i--){
            newName.add(name1[i]);


        }
        String result = String.join("", newName);
        System.out.println(result);

    }
    public static void reverseWords(){
        String apple = "selenium testing";
        String[]  orange = apple.split(" ");
      //  Set<String > newFruit = new HashSet<>();
        List<String> newFruit = new ArrayList<>();
        for(int i = orange.length-1; i>=0; i--){
            newFruit.add(orange[i]);
        }
        String finalValue = String.join(" ", newFruit);
        System.out.println(finalValue);
    }

    public static void RemoveDuplicatedWord(){
        String name3 = "Selenium java IT selenium java i love IT";
        String [] word = name3.split(" ");
        Set<String>  UniqueWordCount = new LinkedHashSet<>();
        for(String newWord: word){
            UniqueWordCount.add(newWord);

        }
        String result = String.join(" ", UniqueWordCount);
        System.out.println(result);
    }

    public static String ArthStringCalculation() {
        String num1 = "123";
        String num2 = "9999";
        int len1 = num1.length();
        System.out.println("lenght of num1 is: " + len1);
        int len2 = num2.length();
        System.out.println("lenght of num2 is: " + len2);
        int maxNum = Math.max(len1, len2);
        System.out.println("maxNumber is:" + maxNum);

        StringBuilder result = new StringBuilder();
        int carry = 0;
        for (int i = 0; i < maxNum; i++) {
            int digit1 = (len1 - 1 - i >= 0) ? num1.charAt(len1 - 1 - i) - '0' : 0;
            int digit2 = (len2 - 1 - i >= 0) ? num2.charAt(len2 - 1 - i) - '0' : 0;
            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            result.append(sum % 10);

        }
        if (carry != 0) {
            result.append(carry);
        }

        result.reverse();
        return result.toString();



    }
    public static void main(String [] args){
        Reverse();
        reverseWords();
        RemoveDuplicatedWord();
        String sum = ArthStringCalculation();
        System.out.println(sum);

    }


}
