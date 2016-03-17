import java.util.HashSet;
import java.util.Set;

/**
 * Created by andrey on 28.10.2015.
 */
public class Main {

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> SD = new HashSet<>();
        Set<T> IS = new HashSet<>();
        SD.addAll(set1);
        SD.addAll(set2);
        IS.addAll(set1);
        IS.retainAll(set2);
        SD.removeAll(IS);
        return SD;
    }
    public static void main(String[] args) {

    }
}
