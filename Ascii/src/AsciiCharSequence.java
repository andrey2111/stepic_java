/**
 * Created by andrey on 09.10.2015.
 */
public class AsciiCharSequence implements CharSequence {

    private byte[] symbol;

    public AsciiCharSequence(byte[] symbol) {
        this.symbol = new byte[symbol.length];
        for (int i = 0; i < symbol.length; ++i)
            this.symbol[i] = symbol[i];

    }

    @Override
    public int length() {
        return symbol.length;
    }

    @Override
    public char charAt(int index) {
        char c = (char) symbol[index];
        return c;
    }

    @Override
    public AsciiCharSequence subSequence(int start, int end) {
        byte[] sub = new byte[end-start];
        for (int i = 0; i < end-start; ++i)
            sub[i] = symbol[i+start];
        AsciiCharSequence subSeq = new AsciiCharSequence(sub);
        return subSeq;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        char[] c = new char[symbol.length];
        for (int i = 0; i < symbol.length; ++i)
            c[i] = (char) symbol[i];
        sb.append(c);
        return sb.toString();
    }

    public static void main(String[] args) {
        byte[] b = new byte[]{65, 66, 67, 68, 69};
        System.out.println(new String(b).subSequence(0, 5));
        System.out.println(new AsciiCharSequence(b).toString());

    }
}

