package Chapter_6;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;

public class convertingFilePath_130 {
    // converting file path tp String, URI,file
    static Path path = Paths.get("src/Chapter_6", "creatingFilePath_129.java");
    @Test
    public void stringPth() throws IOException {
        String pathToString = path.toString();
        System.out.println(pathToString);
        System.out.println(path.toAbsolutePath());// absolute path
        System.out.println(path.toRealPath());// real path
        System.out.println(path.toRealPath(LinkOption.NOFOLLOW_LINKS));
    }
    @Test
    public void uriPath() {
        URI pathToURI = path.toUri();
        System.out.println(pathToURI);
    }
    @Test
    public void URIurl() {
        URI uri = URI.create("https://www.learning.com/easytech/");
        Path URITpPath = Paths.get(uri.getPath()).getFileName();
        System.out.println(URITpPath);
    }
    @Test
    public void PthToFile() {
        File pathToFile = path.toFile();
        Path fileToPath = pathToFile.toPath();
        System.out.println(pathToFile);  //src/Chapter_6/creatingFilePath_129.java
        System.out.println(fileToPath); //src/Chapter_6/creatingFilePath_129.java
    }
}
