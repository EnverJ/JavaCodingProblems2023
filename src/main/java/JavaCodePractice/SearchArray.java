package JavaCodePractice;

public class SearchArray {
    public static void main(String [] args){
        int [] arr = {1,3,3,4,5,6,6,7,8,9,9};
        int target = 9;
        boolean found = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                System.out.println("found at indext: " +i);
                found=true;
            }
        }
        if(!found){
            System.out.println("element is not found: ");
        }
    }
}
