import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class CheakedExceptions {
    public static void main(String args[]) {
        int n;
        FileInputStream fis;
        try {
            fis = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Unable to open file. Please check file name and path");
            return;
        }
        try {
            do {
                n = fis.read();
                if (n != -1) {
                    System.out.print((char) n);
                }
            } while (n != -1);
        } catch (IOException e) {
            System.out.println("Error while reading file");
        }
        try {
            fis.close();
        } catch (IOException e) {
            System.out.println("Error while closing file");
        }
    }
}
