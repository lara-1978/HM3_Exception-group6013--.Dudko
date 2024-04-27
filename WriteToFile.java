package HW3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public void writeToFile(String firstname, String line) throws IOException {
    BufferedWriter writer = new BufferedWriter(new FileWriter(firstname + ".txt", true));
    writer.write(line);
    writer.newLine();
    writer.close();
    }
    
}

