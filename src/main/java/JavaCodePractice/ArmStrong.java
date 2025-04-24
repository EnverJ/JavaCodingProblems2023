package JavaCodePractice;

public class ArmStrong {
    //An Armstrong number (also called a narcissistic number)
    // //is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
    public static void main(String [] args){
        int num = 153, sum=0, temp= num;
        while(temp!=0){
            int digit = temp % 10;
            sum += Math.pow(digit,3);
            temp/=10;

        }
        System.out.println(num==sum);
    }
}
