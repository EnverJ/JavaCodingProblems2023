package geeks;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamClass {
    //Intermediate Operations:
    @Test
    public void streamMap() {
        //map: The map method is used to returns a stream consisting of the results of applying the
        List<Integer> num = Arrays.asList(2, 3, 4, 5);
        List square = num.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(square); //output: [4, 9, 16, 25]
    }
    @Test
    public void filterStream() {
        // filter: The filter method is used to select elements as per the Predicate passed as argument.
        List<String> countries = Arrays.asList("USA", "UK", "UAS", "Japan", "France", "Turkey");
        List select = countries.stream().filter(s -> s.startsWith("U")).collect(Collectors.toList());
        System.out.println(select); //output: [USA, UK, UAS]
    }
    @Test
    public void sortedStream() {
        List<String> ball = Arrays.asList("Soccer", "Baseball", "Football", "Basketball", "Vally-ball");
        List ballSort = ball.stream().sorted().collect(Collectors.toList());
        System.out.println(ballSort);  // [Baseball, Basketball, Football, Soccer, Vally-ball]
    }
    //Terminal Operations:
    //1. collect: The collect method is used to return the result of the intermediate operations performed on the stream.
    @Test
    public void collectStream() {
        List<Integer> num = Arrays.asList(2, 3, 4, 5);
        List sq = num.stream().map(s -> s * s).collect(Collectors.toList());
        System.out.println(sq);
    }
    //2. forEach: The forEach method is used to iterate through every element of the stream.
    @Test
    public void forEachStream() {
        List<Integer> num = Arrays.asList(2, 3, 4, 5, 6);
        num.stream().map(x -> x * x).forEach(y -> System.out.println(y));
    }
    //3. reduce: The reduce method is used to reduce the elements of a stream to a single value.
    //The reduce method takes a BinaryOperator as a parameter.
    @Test
    public void reduceStream() {
        List<Integer> number = Arrays.asList(2, 3, 4, 5);
        int event = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
        System.out.println(event);
    }
    //// set
    @Test
    public void setStream() {
        List<Integer> num = Arrays.asList(2, 3, 4, 5, 6);
        num.stream().map(x -> x * x).collect(Collectors.toSet());
        System.out.println(num); //output: [2, 3, 4, 5, 6]
    }
    @Test
    public void arraysStream() {
        String[] arr = {"Java", "for", "coding"};
        // Using Arrays.stream() to convert
        // array into Stream
        Stream<String> stream = Arrays.stream(arr);
        // Displaying elements in Stream
        stream.forEach(s -> System.out.print(s + " ")); //Java for coding
    }
@Test
    public void forEachPrintStream () {
        // Creating a list of Integers
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
     list.stream().sorted(Comparator.reverseOrder()).forEach(System.out :: println); //10,8,6,4,,2
    }

}
