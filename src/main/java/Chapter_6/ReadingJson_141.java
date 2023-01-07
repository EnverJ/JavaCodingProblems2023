package Chapter_6;

import org.springframework.boot.autoconfigure.amqp.RabbitProperties;
import org.testng.annotations.Test;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;


public class ReadingJson_141 {


    private String firstName;
    private String lastName;
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void arrayPath() throws IOException {
        Jsonb jsonb = JsonbBuilder.create();
        Path pathArray = Paths.get("ezo_array.json");
       ReadingJson_141[] rArray= jsonb.fromJson(Files.newBufferedReader(pathArray, StandardCharsets.UTF_8), (Type) ReadingJson_141[].class);

    }

    public void rawPath() {
        Path pathRaw = Paths.get("ezo_raw.json");
    }

    public void mapPath() {
        Path pathMap = Paths.get("Map_like.json");
    }

}
