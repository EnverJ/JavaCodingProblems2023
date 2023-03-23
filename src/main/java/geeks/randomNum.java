package geeks;

import java.util.Random;
import java.util.function.IntSupplier;

public class randomNum {
    public static void main(String[] args) {
        Random random = new Random(314L);
        IntSupplier newRandom = () -> random.nextInt();
        System.out.println(newRandom);

    }


}
