package adapter;

public class HdmiToUsbImpl implements HdmiToUsb {
    private Hdmi hdmi;

    public HdmiToUsbImpl(Hdmi hdmi) {
        this.hdmi = hdmi;
    }

    @Override
    public void connect() {
        hdmi.connect();
        System.out.println("Laczenie HDMI z USB");
    }
}
