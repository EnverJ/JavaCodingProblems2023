package Chapter_1;

public class ConvertingIntoNumberByAnUnsignedConvention {
    static long result = Integer.toUnsignedLong(Integer.MAX_VALUE);
    static long result3 = Integer.toUnsignedLong(Integer.MIN_VALUE);
   static int result1 = Short.toUnsignedInt(Short.MIN_VALUE);
   static  int result2 = Short.toUnsignedInt(Short.MAX_VALUE);
    public static void main(String[] args) {
        System.out.println(result+ " "+result3+" "+result1+" "+result2); //2147483647 2147483648 32768 32767
    }
}
