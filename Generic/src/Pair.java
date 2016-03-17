import java.util.Objects;

/**
 * Created by andrey on 28.10.2015.
 */
class Pair<Integer, String> {
    private final Integer intValue ;
    private final String stringValue ;

    private Pair (Integer intValue, String stringValue) {
        this.intValue= intValue;
        this.stringValue= stringValue;
    }

    public Integer getFirst() {
        return intValue;
    }

    public String getSecond() {
        return stringValue;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair<?, ?> pair = (Pair<?, ?>) o;

        if (intValue != null ? !intValue.equals(pair.intValue) : pair.intValue != null) return false;
        return !(stringValue != null ? !stringValue.equals(pair.stringValue) : pair.stringValue != null);

    }


    public int hashCode() {
        return intValue.hashCode()+stringValue.hashCode();
    }

    public static <Integer, String> Pair <Integer, String> of(Integer intValue, String stringValue) {
        return new Pair<Integer, String>(intValue,stringValue);
    }

}
