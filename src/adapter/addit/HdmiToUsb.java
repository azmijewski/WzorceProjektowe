package adapter.addit;

public class HdmiToUsb implements Adapter {
    private Plugin plugin;

    public HdmiToUsb(Plugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public void connect() {
        plugin.connectTo();
        System.out.println("Przejsciowka z hdmi do usb");
    }
}
