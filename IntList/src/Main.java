/**
 * Created by andrey on 28.10.2015.
 */
import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
public class Main {

    public static void main(String[] args) {

        Integer v = new Integer(0);
        Deque<Integer> list = new ArrayDeque<Integer>();
        Scanner sc = new Scanner(System.in);
        boolean even=true;
        while (sc.hasNextInt()) {
            v = sc.nextInt();
            if (!even) list.addFirst(v);
            even = !even;
        }


        for ( Integer element : list ) {
            System.out.print(element);
            System.out.print(" ");
        }
}
}
