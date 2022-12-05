package Chapter_1;

public class ConcatRepeat_20 {
    public static String concatRepeat (String str, int n) {
        StringBuilder sb = new StringBuilder(str.length() * n );
        for (int i = 1; i<= n; i++) {
            sb.append(str+" ");
        }
        return sb.toString();
    }
   // output : Java Java Java Java Java Java Java Java Java Java
    // solution 2
    public  static String concatRepeat_2 (String str) {
        String result = str.repeat(5);
        return result;
        // out put: JavaJavaJavaJavaJava
    }

    public static void main(String[] args) {
        System.out.println(concatRepeat("Java", 10));

        System.out.println(concatRepeat_2("Java"));
    }
}
