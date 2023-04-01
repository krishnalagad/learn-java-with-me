import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadWriteFile {
    public static void main(String[] args) {
        File file = new File("test.txt");
        File writeFile = new File("output.txt");

        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                
                line = br.readLine();
            }
            br.close();

            if (!writeFile.exists()) {
                writeFile.createNewFile();
            }
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(writeFile))) {
                bufferedWriter.write("New line number 1.");
                bufferedWriter.newLine();
                bufferedWriter.write("New line number 2.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
