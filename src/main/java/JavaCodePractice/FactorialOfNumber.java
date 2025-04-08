package JavaCodePractice;

public class FactorialOfNumber {

    //FactorialOfNumber: is the product of all positive integers less than or equal to n.
    public static void main(String [] args){
        int num=5, factorial =1;
        for(int i=1; i<=num;i++){
            factorial*=i;

        }
        System.out.println(factorial);
    }
}
