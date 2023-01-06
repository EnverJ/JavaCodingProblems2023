package Chapter_1;

import java.util.function.BinaryOperator;

public class MinMaxTwoNum_25 {
    public static String MixMan() {
        int i1 = 90;
        int i2 = -34;
        int min = Math.min(i1, i2);
        int max = Math.max (i1, i2);
        return ("max: "+max+" , "+" min: "+min);
    }
    public static String minManBinary () {
        float f1 = 0.09F;
        float f2 = 33.34F;
        float min = BinaryOperator.minBy(Float :: compare) .apply(f1, f2);
        float max = BinaryOperator.maxBy(Float :: compare) . apply(f1, f2);
        return ("max: "+max+" , "+" min: "+min);

    }

    public static void main(String[] args) {
        System.out.println(MixMan());  // output:  max: 90 ,  min: -34
        System.out.println(minManBinary());  //max: 33.34 ,  min: 0.09
    }

}
