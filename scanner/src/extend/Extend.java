package extend;

/**
 * Created by apple on 24/01/2017.
 */
import java.util.*;
import java.io.*;
import java.io.IOException;
import java.lang.*;


public class Extend {

    private  File file;
    private  Scanner scanner;

    public Extend (File file,Scanner scanner) {
        this.scanner = scanner;
        this.file = file;
    }

    public void getContentFile () {
         getContentFile_();
    }

    private void getContentFile_() {
        Integer lol = 0;
        while(this.scanner.hasNextLine()) {
            String line = this.scanner.nextLine();
            try {
               lol += Integer.parseInt(line);
            }catch (Exception e) {
                continue;
            }
        }
        System.out.println(lol);
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
