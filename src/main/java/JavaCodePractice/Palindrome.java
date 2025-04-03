package JavaCodePractice;

public class Palindrome {
    public static void main(String [] args){
        String str = "madam";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);


        String name = "Testing";
        StringBuilder  sb = new StringBuilder();
        for( int i=name.length()-1; i>=0; i--){
            sb.append(name.charAt(i));
        }
        if(name.equals(sb.toString())){
            System.out.println("The String : "+name+ " is palindrom ");
        }
        else{
            System.out.println("The String : "+name+ " is  not palindrom ");
        }
    }
}
