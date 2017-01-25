/**
 * Created by apple on 24/01/2017.
 */

import java.util.*;
import java.io.*;
import java.io.IOException;
import java.lang.*;
import extend.Extend;

public class Main {
    public static void main(String [] args) {

        File file = new File("foo.txt");
        try {
            Scanner scanner = new Scanner(file);
            Extend extend = new Extend(file,scanner);
            extend.getContentFile();
        }catch (FileNotFoundException e) {
            System.out.println("le fichier n'a pas etait trouver on ce stop");
        }



    }
}
