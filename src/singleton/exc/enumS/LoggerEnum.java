package singleton.exc.enumS;

import singleton.log.Log;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public enum LoggerEnum {
    INSTANCE;
    private LoggerEnum(){

    }
    public void saveLog(Log log) {
        try (FileWriter  fileWriter = new FileWriter("log.txt");){
            fileWriter.append(LocalDate.now().toString()).append(" ").append(String.valueOf(log)).append("\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
