/**
 * Created by andrey on 23.10.2015.
 */
import java.io.*;

public class Main {
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        Reader reader = new InputStreamReader ( inputStream , charset);
        char c; StringBuilder str = new StringBuilder();
       while ((c = (char) reader.read())>0)
           str.append(c);
        return str.toString();

    }
}
