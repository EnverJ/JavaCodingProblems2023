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


    public static int[] getNeighborsOfPeaks(int[] nums) {
        Set<Integer> neighbors = new LinkedHashSet<>(); // Use LinkedHashSet to maintain order and remove duplicates

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) { // Checking for peak
                neighbors.add(nums[i - 1]); // Left neighbor
                neighbors.add(nums[i + 1]); // Right neighbor
            }
        }

        // Convert Set to int[]
        int[] result = new int[neighbors.size()];
        int index = 0;
        for (int num : neighbors) {
            result[index++] = num;
        }

        return result;
    }

    public static void SecondSmallAndSecondLargestElement() {
        int[] nums = {10, 20, 20, 45, 34, 23, 56, 56, 78, 78};
        TreeSet<Integer> sortedSet = new TreeSet<>();
        for (int num : nums) {
            sortedSet.add(num);
        }
        if (sortedSet.size() < 2) {
            System.out.println("there is not enough two unique elements");
            return;
        }
        Integer[] uniqueSorted = sortedSet.toArray(new Integer[0]);

        int secondSmall = uniqueSorted[1];
        int secondLargest = uniqueSorted[uniqueSorted.length - 2];

        System.out.println("Second Smallest: " + secondSmall);
        System.out.println("Second Largest: " + secondLargest);

        // System.out.println("lenth of array: " + nums.length);
        //Arrays.sort(nums);
        //int secSmall= nums[1];
        //int secMax= nums[nums.length-2];
        // System.out.println(secSmall+" "+secMax);


    }
    public static String ReverseBigWords(String sentence){
        String[] words = sentence.split("");
        for(int i=0; i<words.length-1; i++){
            if(words[i].length()>3){
                words[i]=new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" " , words);
    }

    public static void MoveToZeroEnd1( int[] arr1){
        List<Integer> num = new LinkedList<>();
        for(int i=0; i<arr1.length; i++){
            if(arr1[i] !=0){
                num.add(arr1[i]);

            }
        }
        for(int j=0; j<arr1.length; j++){
            if(arr1[j]==0){
                num.add(arr1[j]);
            }
        }
        System.out.println("this is Enver: "+num);
    }
    public static void moveZeroToEnd( int[] arr){
        int index =0;
        for(int num: arr){
            if(num!=0){
                arr[index++]=num;
            }
        }
        while(index<arr.length){
            arr[index++]=0;
        }
    }



    public static void main(String[] args) {

        int[] arr = {1,4,0,5,0,0,1,0,0};
    //    int[] arr1 = {1,4,0,5,0,0,1,0,0};
        MoveToZeroEnd1(arr);
        System.out.println(arr.length);
        moveZeroToEnd(arr);

        System.out.println(Arrays.toString(arr));
        String sentence = "reverse a big words only";
        System.out.println(ReverseBigWords(sentence));
        String sum = arthStringCalculation();
        System.out.println("Sum: " + sum);
        //   revString();
        //    ForLoopReverseSt();
        // removeDuplicatedWords();
        int[] nums = {10, 40, 25, 3, 22, 80, 56};
        int[] result = getNeighborsOfPeaks(nums);

        // Print the result
        System.out.println(Arrays.toString(result));
        SecondSmallAndSecondLargestElement();


    }
}









