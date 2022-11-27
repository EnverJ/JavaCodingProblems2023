package Chapter_1;

public class countOccurrenceChar_6 {
    public static long countOccurrenceChar(String str, char ch){
        return str.chars().filter(c -> c==ch).count();
    }

    public static void main(String[] args) {
        System.out.println(countOccurrenceChar("Java is awesome",'J'));
    }
}
