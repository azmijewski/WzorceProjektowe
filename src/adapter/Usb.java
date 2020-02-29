package adapter;

public class Usb {
    public void connect(HdmiToUsb hdmi){
        hdmi.connect();
        System.out.println("Połączono");
    }
}
