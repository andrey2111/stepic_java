/**
 * Created by andrey on 23.10.2015.
 */
import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader reader = new InputStreamReader(System.in, Charset.defaultCharset());
        Scanner scanner = new Scanner ( reader );
        double sum = 0;

            Double x= new Double(0);
            while (scanner.hasNext())
                try {  sum += x.parseDouble(scanner.next()); }
                catch (NumberFormatException e) {

                }
            System.out.printf("%.6f", sum);

    }
}
