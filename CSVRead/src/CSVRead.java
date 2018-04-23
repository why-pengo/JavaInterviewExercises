import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CSVRead {
    public void parse(String file, String delimiter) {
        try {
            FileReader fileReader;
            String filePath = new File("").getAbsolutePath();
            fileReader = new FileReader(filePath + "/src/" + file);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split(delimiter);

                System.out.print("CSVRead: values = ");
                for(int i=0; i<values.length; i++) {
                    System.out.print(values[i]);
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
