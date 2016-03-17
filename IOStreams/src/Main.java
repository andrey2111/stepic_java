/**
 * Created by andrey on 23.10.2015.
 */
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStream stream;
        int result;
        stream = getStream( new byte[] { 0x33, 0x45, 0x01});

        result = checkSumOfStream(stream);
        System.out.print(result);
    }

    public static InputStream getStream(byte [] data)  {
        return new ByteArrayInputStream (data);
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int C=0;
        int x;
        for(int i=0;(x = inputStream.read())>0;++i)
            C = Integer.rotateLeft(C, 1) ^ x;
        return C;

    }


}
