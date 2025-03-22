package BuilderPattern;

public class Person {
    private String fname;
    private String lname;
    private int age;

    // Private constructor that takes a PersonBuilder
    private Person(PersonBuilder personBuilder) {
        this.fname = personBuilder.fname;
        this.lname = personBuilder.lname;
        this.age = personBuilder.age;
    }

    // Static nested PersonBuilder class
    public static class PersonBuilder {
        private String fname;
        private String lname;
        private int age;

        // Setter method for fname with method chaining
        public PersonBuilder setFname(String fname) {
            this.fname = fname;
            return this;
        }

        // Setter method for lname with method chaining
        public PersonBuilder setLname(String lname) {
            this.lname = lname;
            return this;
        }

        // Setter method for age with method chaining
        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        // Method to build a Person object
        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person [fname=" + fname + ", lname=" + lname + ", age=" + age + "]";
    }

    public static void main(String[] args) {
        // Using the Builder to create a Person object with method chaining
        Person person = new Person.PersonBuilder()
                .setFname("Titan")
                .setLname("White")
                .setAge(25)
                .build();

        // Print the Person object
        System.out.println(person);
    }
}