package Chapter_1;

import java.util.stream.Stream;

public  class TransformingString_24 {
    public static String mapTransforming() {
        String resultMp = Stream.of("hello")
                .map(s -> s + " world")
                .findFirst()
                .get();
        return resultMp;
    }
    public static String goooool(){
        String resultMap = Stream.of("gooool!   ")
                .map(String::toUpperCase)
                .map(s-> s.repeat(2))
                .map(s-> s.replaceAll("O","OOO"))
                .findFirst()
                .get();
        return resultMap;
    }
    public static String goool_jdk12() {
        String result = "hello".transform(s-> s + "world");
//        String resultGol = "goool!".transform(s->s +"  goool!   ")
//                .replaceAll("o","oooo")
//                .toUpperCase();
        // or
        String resultGol = "goool! ".transform(String :: toUpperCase)
                .transform(s -> s.repeat(2))
                .transform(s -> s.replaceAll("O","OOO"));
        return resultGol;


        
    }

    public static void main(String[] args) {
        System.out.println(mapTransforming());   // output : hello world
        System.out.println(goooool());  //GOOOOOOOOOOOOL!   GOOOOOOOOOOOOL!
        System.out.println(goool_jdk12());

    }
    

}
