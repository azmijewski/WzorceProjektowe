package singleton.exc.pugh;

import singleton.log.Log;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class LoggerPugh {


    private static class FileConnectionProviderHolder{
        private static final LoggerPugh INSTANCE = new LoggerPugh();
    }
    private LoggerPugh(){

    }
    public static LoggerPugh getInstance(){
        return FileConnectionProviderHolder.INSTANCE;
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
