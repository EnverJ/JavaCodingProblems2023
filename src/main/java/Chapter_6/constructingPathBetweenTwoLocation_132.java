package Chapter_6;

import org.testng.annotations.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class constructingPathBetweenTwoLocation_132 {
    // use Path.relativize()
    @Test
    public void PathRelativize() {
        Path path1 = Paths.get("constructingPathBetweenTwoLocation_132.java");
        Path path2 = Paths.get("creatingFilePath_129.java");

        Path path1ToPath2 = path1.relativize(path2);
        System.out.println(path1ToPath2); //../creatingFilePath_129.java

        Path path2ToPath1 = path2.relativize(path1);
        System.out.println(path2ToPath1); //../constructingPathBetweenTwoLocation_132.java
    }

    //common relative elements
    @Test
    public void commonRootPathRelativize() {

    Path path3 = Paths.get("src/Chapter_6/constructingPathBetweenTwoLocation_132.java");

    Path path4 = Paths.get("src/Chapter_6/convertingFilePath_130.java");

    Path path3ToPath4 = path3.relativize(path4);
        System.out.println(path3ToPath4); //../convertingFilePath_130.java
    Path path4ToPath3 = path4.relativize(path3);
        System.out.println(path4ToPath3); //../constructingPathBetweenTwoLocation_132.java
}

}
