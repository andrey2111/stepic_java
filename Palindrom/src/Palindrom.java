/**
 * Created by andrey on 02.10.2015.
 */
import java.io.*;
public class Palindrom {
    public static void main(String[] args) {
        String text = new String("Madam, I'm Adam!");
boolean flag = true;
        System.out.print("Edited string" );
        text = text.toLowerCase();
        text = text.replaceAll("[^0-9a-z]", "");
        System.out.println(text);
        char[] arr = text.toCharArray();
               for (int i = 0; arr.length/2 > i; i++) {
         if (arr[i]!=arr[arr.length-i-1]) flag = false;
        }
        System.out.print(flag );
    }
    }

