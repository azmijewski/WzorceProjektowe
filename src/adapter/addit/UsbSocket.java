package adapter.addit;

public class UsbSocket implements Socket {
    @Override
    public void connectIn(Adapter adapter) {
        adapter.connect();
        System.out.println("Polaczono");
    }
}
