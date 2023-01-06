package Chapter_6;

import java.nio.file.Path;

public class path {

    public static Path pathOff() {


    Path path = Path.of("path.java")
            .normalize();
    return path;

}

    public static void main(String[] args) {
        System.out.println(pathOff());
    }

}
