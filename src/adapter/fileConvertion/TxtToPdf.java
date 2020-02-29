package adapter.fileConvertion;

public class TxtToPdf implements Converter {
    private Txt txt;

    public TxtToPdf(Txt txt) {
        this.txt = txt;
    }

    @Override
    public void convert() {
        txt.convert();
        System.out.println("W trakcie konwersji");
    }
}
