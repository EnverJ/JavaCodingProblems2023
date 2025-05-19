package InterviewCoding;

public class MyRecord {
    public record Person(String name, int age){};

    public static void main(String[] args) {
        Person p = new Person("Enver",30);
        System.out.println(p.name());
        System.out.println(p.hashCode());
        System.out.println(p);
        System.out.println(p.equals(new Person("Enver",30)));
    }
}
