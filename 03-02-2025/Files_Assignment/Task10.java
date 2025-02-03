package filesTasks_Feb03;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Task10 {
	public static void main(String[] args) {
        String filePath = "C:/Users/I SIVA HARSHITH/eclipse-workspace/Feb_03_TechMPrograms/src/sample1.dat";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
