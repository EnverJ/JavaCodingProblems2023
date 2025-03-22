package quickSolutions;

public class countInstances {
    static int instanceNum = 0;

    public countInstances() {
        instanceNum++;
    }

    public static void main(String[] args) {
        countInstances cs1 = new countInstances();
        countInstances cs2 = new countInstances();
        countInstances cs3 = new countInstances();
        countInstances cs4 = new countInstances();
        System.out.println("Total instance of class is: " + instanceNum); // 4

    }
}
