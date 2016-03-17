/**
 * Created by andrey on 24.10.2015.
 */
import java.io.*;
import java.util.Objects;
public class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }
}
