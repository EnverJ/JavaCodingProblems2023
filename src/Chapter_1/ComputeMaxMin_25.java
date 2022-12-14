package Chapter_1;

import org.testng.annotations.Test;

import java.util.function.BinaryOperator;

public class ComputeMaxMin_25 {
    @Test
    public void computeMaxMin() {
        double d1 = 0.023400005D;
        double d2 = 0.34350003D;
        double min =  Double.min(d1,d2);
        double max = Double.max(d1,d2);
        System.out.println("min: "+min+", max:"+max);

    }
    @Test
    public void FloatMaxMin () {
        float f1 = 33.45F;
        final float f2 = 33.21F;
        float min = BinaryOperator.minBy(Float :: compare).apply(f1,f2);
        float max = BinaryOperator.maxBy(Float :: compare).apply(f1,f2);
        System.out.println("Float min: "+min+" ,Float max: "+max);
    }

//    public static void main(String[] args) {
//        ComputeMaxMin_25 mn=new ComputeMaxMin_25();
//        mn.computeMaxMin();
//        mn.FloatMaxMin();
//    }
}

