package InterviewCoding;

public enum Season {
    SPRING("warm"),
    SUMMER("Hot"),
    FALL("Cool"),
    WINTER("Cold");

    private final String temperature;

    Season(String temperature) {
        this.temperature = temperature;
    }
    public String getTemperature(){
        return temperature;
    }

    public static void main(String[] args) {
        System.out.println(Season.SPRING.getTemperature());
        System.out.println(Season.FALL.getTemperature());
    }
}
