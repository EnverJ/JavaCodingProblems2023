package lambda;

public class singleMethod implements StringFunction {
    @Override
    public String run(String str) {
        return null;
    }
    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + ("!");
        StringFunction ask = (s) -> s+ ("?");
        printFormatted ("Hello", exclaim);
        printFormatted("Hello", ask);
    }
    public static void printFormatted(String str, StringFunction format) {
      String result = format.run(str);
        System.out.println(result);
    }
}
