package JavaCodePractice;

public class nStar {
public static void print(int b)

{
    for (int a= 0; a<=b; a++)
    {
        for (int i = 0; i < a; i++) {
            System.out.print("*");
        }
        System.out.println();

    }

}

    public static void main(String[] args) {
        print(50);
    }
}
