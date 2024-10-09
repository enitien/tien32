
package manh;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Weather {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream(new File("F:\\Luu tru\\java\\laptrinhjava\\scanfile[\\Weather\\src\\weather\\output.txt"));
        Scanner input = new Scanner(new File("F:\\Luu tru\\java\\laptrinhjava\\scanfile[\\Weather\\src\\weather\\weather.txt"));
        double prev = input.nextDouble(); 
        while (input.hasNextDouble()) {
            double next = input.nextDouble();
            System.out.println("Reading: " + prev + " to " + next + ", change = " + (next - prev));
            ps.println(prev + " to " + next
                    + ", change = " + (next - prev));
            prev = next;
        }
        
    }
}

