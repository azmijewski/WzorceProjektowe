package adapter.addit;

public class HdmiPlugin implements Plugin {
    @Override
    public void connectTo() {
        System.out.println("Lączenie kabla hdmi");
    }
}
