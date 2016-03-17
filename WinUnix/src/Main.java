/**
 * Created by andrey on 23.10.2015.
 */
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
       int x;
        while ((x=System.in.read())>0) {
           if (x==13) {
               if ((x=System.in.read())==10) System.out.write(x); else { System.out.write(13); System.out.write(x);}
               continue;
            }
            System.out.print(x+" ");
        }
        System.out.flush();
/*       byte [] arr = "Ы".getBytes("UTF-8");
for (int i=0;i<2;++i)
    System.out.print(Byte.toUnsignedInt(arr[i])+" ");*/
    }
}
