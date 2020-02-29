package singleton;

public class BillPughSingleton {

    private BillPughSingleton(){}

    private static class BillPughSingletonInstance{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return BillPughSingletonInstance.INSTANCE;
    }
}
