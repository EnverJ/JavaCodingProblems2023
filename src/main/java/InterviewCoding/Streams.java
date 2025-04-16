package InterviewCoding;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void separateList()
    {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.stream().collect(Collectors.toList());

    }

    public static void main(String[] args) {

    }
}
