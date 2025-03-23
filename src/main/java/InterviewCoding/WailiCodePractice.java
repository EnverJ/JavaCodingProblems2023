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
    public static void main(String [] args){
        Reverse();
        reverseWords();
        RemoveDuplicatedWord();

    }


}
