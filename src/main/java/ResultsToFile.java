import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ResultsToFile implements resultList{
    public static void ResultToFile() throws IOException {
        File myObj = new File("C:\\Users\\עדן ח\\Desktop\\Qa automation\\results.txt");
        FileWriter myWriter = new FileWriter(myObj);
        myWriter.write(String.valueOf(ResultList));
        myWriter.close();
        System.out.println("These are the amounts you converted" + ResultList);

    }
}
