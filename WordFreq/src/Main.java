import java.io.*;
import java.util.*;
import java.util.stream.*;

/**
 * Created by andrey on 29.10.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
        Stream<String> input = in.lines();
        Map<String,Long> MAP = new LinkedHashMap<>();

        input.map(String::toLowerCase)
                .map(line -> line.split("[^\\p{L}\\p{Digit}_]+"))
                .flatMap(Arrays::stream)
                .sorted()
                .forEach(s -> {if (MAP.containsKey(s)) MAP.put(s, MAP.get(s) + 1L); else MAP.put(s,1L);})

        ;
       Stream <Map.Entry<String,Long>> input1 = MAP.entrySet()
               .stream()
               .sorted(Comparator.comparing((Map.Entry<String, Long> entry) -> entry.getValue()).reversed())
               .limit(10);
        input1.forEach(s -> {System.out.println(s.getKey());});
    }
}
