package Chapter_1;

public class RemovingWhiteSpace_8 {
    public static String removeWhiteSpace(String str){
       return str.replaceAll("\\s","           ");
    }

    public static void main(String[] args) {
        System.out.println(removeWhiteSpace("Jav Python Javascript"));

    }
}
