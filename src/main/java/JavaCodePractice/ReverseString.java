package JavaCodePractice;

public class ReverseString {
    //reverse String
    public static void main(String [] args){
        String str = "Automation Testing";
        String [] words = str.split(" ");
        StringBuilder result =  new StringBuilder();
        for(int i =words.length-1; i>=0; i--){

           result.append(words[i]).append(" ");
        }
        System.out.println(result.toString().trim());
       //reverse string
        String name = "Automation";
        StringBuilder  result1 = new StringBuilder(name).reverse();
        System.out.println(result1);
        //reverse String

        String word = "Testing";
        StringBuilder reverseValue = new StringBuilder();
        for(int i=word.length()-1 ; i>=0; i--){
            reverseValue.append(word.charAt(i));
        }
        System.out.println("Reversed Value; " +reverseValue.toString());

        //reverse string no bult in methods
        String reverseStr= "Testing";
        char[] chars = reverseStr.toCharArray();
        String reversed = " ";
        for(int i =chars.length-1; i>=0; i--){
            reversed+= chars[i];
        }

       System.out.println(reversed);



    }

}
