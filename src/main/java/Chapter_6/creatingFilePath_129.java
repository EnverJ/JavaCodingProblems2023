package Chapter_6;

import org.testng.annotations.Test;

import java.net.URI;
import java.nio.file.*;
import java.sql.SQLOutput;

public class creatingFilePath_129 {
    @Test
    public void path() {
        Path path1 = Paths.get("src/Chapter_6/creatingFilePath_129.java");
        Path path2 = Paths.get("src", "/Chapter_6/creatingFilePath_129.java");
        System.out.println(path1);
        System.out.println(path2);
    }
@Test
    public void pathOf() {
        Path pathOf1 = Path.of("src/Chapter_6/creatingFilePath_129.java");
        Path pathOf2 = Path.of("src", "/Chapter_6/creatingFilePath_129.java");
    System.out.println(pathOf1);
    System.out.println(pathOf2);
    }
@Test
    public void pathD() {
    Path pathD = FileSystems.getDefault().getPath("src/Chapter_6", "creatingFilePath_129.java");
    Path pathD2 = FileSystems.getDefault().getPath("src/Chapter_6/creatingFilePath_129.java");
    System.out.println(pathD);
    System.out.println(pathD2);
}
@Test
public void pathU () {
    Path pathU = Paths.get(URI.create("file:////src/Chapter_6/creatingFilePath_129.java"));
    Path pathU2 = Path.of(URI.create("file:////src/Chapter_6/creatingFilePath_129.java"));
    System.out.println(pathU);
    System.out.println(pathU2);
}

}
