package chapter_2;

public final class immutableClass_49 {
    // class should be marked as final
    // all fields should be declared private and final(not visible in other classes. initialized by constructor )
    // parameterized public/private constructor that initialized the fields
    // getter
    // should not be exposed to setter
     private final double x;
     private  final double y;


    public immutableClass_49(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public  double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public static void main(String[] args) {
        new immutableClass_49(6,9);
    }
}
