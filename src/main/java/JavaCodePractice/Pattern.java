package JavaCodePractice;

public class Pattern {
    public static void main(String[] args) {
        int size = 4;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}