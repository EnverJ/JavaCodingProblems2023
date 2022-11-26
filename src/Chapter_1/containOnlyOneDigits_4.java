package Chapter_1;

public class containOnlyOneDigits_4 {
    public  static boolean containOnlyDigits(String str){
         return str.matches("[ 0-9 ]+");

    }

    public static void main(String[] args) {
        System.out.println(containOnlyDigits("@@@@"));
    }
}
