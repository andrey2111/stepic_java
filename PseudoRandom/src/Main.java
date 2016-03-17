
import java.util.stream.*;

/**
 * Created by andrey on 29.10.2015.
 */
public class Main {

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate (seed , n -> ((n*n)%10000)/10).limit(10);
    }

   public static void main(String[] args) {
       IntStream stream1 = pseudoRandomStream(13);
       stream1.forEach(System . out :: println );

   }
}
