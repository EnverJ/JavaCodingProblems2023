//package Chapter_1;
//
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Map;
//
//import static java.util.Map.Entry.comparingByValue;
//import static java.util.stream.Collectors.counting;
//import static java.util.stream.Collectors.groupingBy;
//
//public class FindingMostAppearanceChar_14 {
//
////    public static  Pair <Character,Integer> findingMostAppearanceCharacter(String str) {
////        Map<Character, Integer> counter=new HashMap<>();
////        char[] chStr = str.toCharArray();
////
////        for (int i =0 ; i < chStr.length; i++) {
////            char currentCH = chStr[i];
////            if (!Character.isWhitespace(currentCH)) {  // IGNORE SPACE
////                Integer noCh = counter.get(currentCH);
////                if (noCh == null) {
////                    counter.put(currentCH, 1);
////                } else {
////                    counter.put(currentCH, ++noCh);
////                }
////
////            }
////        }
////
////        int maxOccurrence = Collections.max ( counter.values() );
////        char maxCharacter = Character.MIN_VALUE;
////
////        for (Map.Entry<Character, Integer> entry: counter.entrySet()) {
////            if (entry.getValue() == maxOccurrence) {
////                maxCharacter = entry.getKey();
////            }
////        }
////        return Pair.of(maxCharacter,maxOccurrence);
////    }
////
////    public static void main(String[] args) {
////        findingMostAppearanceCharacter("Googl Cloud Enginnering");
////    }
//
//
//
//    // Solution 2
//  public void maxOccurenceCharacter (String str ) {
//      return str.chars()
//              . filter( c -> Character.isWhitespace(c) == false) //ignore space
//              .mapToObj(c -> (char) c)
//              .collect(groupingBy (c-> c, counting()))
//              .entrySet()
//              .stream()
//              .max(comparingByValue())
//              .map(p -> Pair.of (p.getKey(),p.getValue()))
//              .orElse(Pair.of(Character.MIN_VALUE,-1L));
//  }
//}
