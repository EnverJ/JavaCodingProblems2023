package lambda.geeksLambda;

public interface funInterFace {
    void abstractFun (int x);

    default void normalFun() {
        System.out.println("Hello");
    }
}
