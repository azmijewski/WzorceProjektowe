package singleton.exc.lazy;

import singleton.log.Log;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class LoggerLazy {
    private static LoggerLazy instance;
    private LoggerLazy()  {

    }
    public static LoggerLazy getInstance(){
        if (instance == null){
            instance = new LoggerLazy();
        }
        return instance;
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
