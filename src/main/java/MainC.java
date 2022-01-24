import MainConverter.Convert;
import MainConverter.Menu;
import Results.ResultsToFile;

import java.io.*;

public class MainC {
    public static void main(String[] args) throws IOException {
        Menu.Welcome();
        Convert.convert();
        ResultsToFile.ResultToFile();

    }
}

