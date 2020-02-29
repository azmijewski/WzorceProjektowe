import singleton.exc.enumS.FileConnectionProviderEnum;
import singleton.exc.pugh.FileConnectionProviderBill;
import singleton.log.Level;
import singleton.log.Log;

public class Main {
    public static void main(String[] args) {
        Log log = new Log(Level.INFO, "Inicjacja znowu udana");
        FileConnectionProviderEnum fileConnectionProvider = FileConnectionProviderEnum.INSTANCE;
        fileConnectionProvider.saveLog(log);
    }
}
