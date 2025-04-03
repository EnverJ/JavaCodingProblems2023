package InterviewCoding;

import java.util.ArrayList;

public class Sorting {



    public static void sorting(){
        int[] a= {2,4,6,3,12,90};
        ArrayList<Integer> aist = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-1; j++) {
                int temp = a[j];
                if (a[j] < a[j+1]) {
                    temp = a[j+1];
                }
                aist.add(temp);
            }

        }
        System.out.println(aist);
    }

    public static void main(String[] args) {
        sorting();

    }
}
