package singleton.exc.pugh;

import singleton.log.Log;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class FileConnectionProviderBill {


    private static class FileConnectionProviderHolder{
        private static final FileConnectionProviderBill INSTANCE = new FileConnectionProviderBill();
    }
    private FileConnectionProviderBill(){

    }
    public static FileConnectionProviderBill getInstance(){
        return FileConnectionProviderHolder.INSTANCE;
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
