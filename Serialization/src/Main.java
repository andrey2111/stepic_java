/**
 * Created by andrey on 24.10.2015.
 */
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static Animal[] deserializeAnimalArray(byte[] data) {
        try(ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))){
            int ArrLengh = ois.readInt();
            if (ArrLengh < 1) return new Animal[]{};
            Animal[] deserial = new Animal[ArrLengh];
            for (int i=0;i<ArrLengh;++i)
                deserial[i] = (Animal) ois.readObject();
            return deserial;
        }
        catch (Exception e){
            throw new java.lang.IllegalArgumentException(e);
        }
    }
    public static void main(String[] args) throws Exception {
        Animal Tiger = new Animal("Tiger");
        Animal Lion = new Animal("Lion");
        Animal Wolf = new Animal("Wolf");
        Animal[] AnimalArr = new Animal[]{Tiger,Lion,Wolf};
        Path path = Paths.get("object.bin");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.write(AnimalArr.length);
            for (int i=0;i<AnimalArr.length;++i)
            oos.writeObject(AnimalArr[i]);
        }
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            int ArrLengh = ois.read();
            Animal[] deserial = new Animal[ArrLengh];
            for (int i=0;i<ArrLengh;++i) {
                deserial[i] = (Animal) ois.readObject();
                System.out.println(deserial[i].getName());
            }
        }

    }
}
