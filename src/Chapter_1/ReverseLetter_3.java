package Chapter_1;

public class ReverseLetter_3 {
    public static String reverse(String str){
       return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("Java is beautiful"));
    }
}
