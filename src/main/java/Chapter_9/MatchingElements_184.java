package Chapter_9;

import java.util.Arrays;
import java.util.List;

public class MatchingElements_184 {
    //anyMatch
    //noneMatch
    //allMatch
    List<String> countries = Arrays.asList(
            "USA","AUS","USA", "Canada", "Japan", "UK", "France", "Dutch"
    );
    // Dose an element match the USA string?
    public boolean MatchingElementStream(){

        // Dose an element match the USA string?
        boolean isAnyUSA = this.countries.stream()
                .anyMatch(m-> m.equals("USA"));
        return isAnyUSA;
    }

    // Dose an element match Japan?
    public boolean anyMatchStream () {
        boolean isAnyJapan = this.countries.stream()
                .anyMatch(m-> m.equals("Japan"));
        return isAnyJapan;
    }
    // Do no element match USA?
    public boolean noMatchUSA () {
        boolean isNoUSA = this.countries.stream()
                .noneMatch(m-> m.equals("USA"));
        return isNoUSA;
    }
    // Do no element match Japan?
    public boolean noMatchJapan () {
        boolean isNoJapan = this.countries.stream()
                .noneMatch(m-> m.equals("Japan"));
        return isNoJapan;
    }

    //Dose all element match USA?
    public boolean allMatchUSA () {
        boolean areAllUSA = this.countries.stream()
                .allMatch(m-> m.equals("USA"));
        return areAllUSA;

    }
    // Dose all elements greater than 2?

    public boolean areAllGreaterThan2 () {
        boolean allGreaterThan2 = this.countries.stream()
                .allMatch(m-> m.length()>2);
        return allGreaterThan2;
    }

    public static void main(String[] args) {
        MatchingElements_184 match = new MatchingElements_184();
        System.out.println(
        match.MatchingElementStream()+" " +
        match.anyMatchStream()+" " +
        match.noMatchUSA()+" " +
        match.noMatchJapan()+" " +
        match.allMatchUSA()+" " +
        match.areAllGreaterThan2()
        );
    }

}
