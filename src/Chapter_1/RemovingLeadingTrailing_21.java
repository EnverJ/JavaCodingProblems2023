package Chapter_1;

public class RemovingLeadingTrailing_21 {
    public static String removingTrim (String str) {
        String trimmed = str.trim();
        return trimmed;
    }


    // output: hello
    //solution 2
    public static String RemovingStrip (String str) {
        String text=str.strip();
        String text1=str.stripLeading();
        String text2=str.stripTrailing();
        return (text+", "+text1+", "+text2);
    }

    public static void main(String[] args) {
        System.out.println("\n  \n\n hello \t \n \r");
        System.out.println(RemovingStrip(" this is java strip "));
    }
}
