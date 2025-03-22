package BuilderPattern;

public class Car {
    private String year;
    private String model;
    private String color;

    public static class Builder {
        private String year;
        private String model;
        private String color;

        public Builder setYear(String year) {
            this.year = year;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(this);

        }
    }

    private Car(Builder builder) {
        this.year = builder.year;
        this.model = builder.model;
        this.color = builder.color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year='" + year + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Car car = new Car.Builder().setModel("Tesla").setColor("White").setYear("2023").build();

        System.out.println(car.toString());
    }
}
