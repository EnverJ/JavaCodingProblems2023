package Chapter_6;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadingJson_141 {
    private String firstName;
    private String lastName;

    public void arrayPath() {
        Path pathArray = Paths.get("ezo_array.json");
    }

    public void rawPath() {
        Path pathRaw = Paths.get("ezo_raw.json");
    }

    public void mapPath() {
        Path pathMap = Paths.get("Map_like.json");
    }
}
