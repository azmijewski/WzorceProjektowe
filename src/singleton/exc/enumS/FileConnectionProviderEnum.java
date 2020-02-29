package singleton.exc.enumS;

import singleton.log.Log;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public enum  FileConnectionProviderEnum {
    INSTANCE;
    private FileConnectionProviderEnum(){

    }
    public void saveLog(Log log) {
        try (FileWriter  fileWriter = new FileWriter("log.txt");){
            fileWriter.write(LocalDate.now().toString() + " " + log + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
