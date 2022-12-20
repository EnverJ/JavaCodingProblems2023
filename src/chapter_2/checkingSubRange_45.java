package chapter_2;

import java.util.Objects;

public class checkingSubRange_45 {
    private static final int N_UPPER_BOUND = 101;
    private final int n;


    public checkingSubRange_45(int n) {
        this.n = Objects.checkIndex(n,N_UPPER_BOUND);
    }
    public int yMinusX (int x, int y) {
        Objects.checkFromToIndex(x,y,n);
        // check weather the given subrange[give start, given end] is within the bounds of the range
        // from [0, given length]. So, this method can be applied to the yMinusX() method to check that
        // the range bounded by x and y, [x,y] is subrange of [0,n].
        return y - x;
    }

    public static void main(String[] args) {
        checkingSubRange_45 ch = new checkingSubRange_45(50);
        int r = ch.yMinusX(1,50);// output: 49

      //  int r = ch.yMinusX(120,50); //Exception in thread "main" java.lang.IndexOutOfBoundsException: Range [120, 50) out of bounds for length 50
        System.out.println(r);
    }

}
