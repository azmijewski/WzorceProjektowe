package adapter.fileConvertion;

public class HtmlToPdf implements Converter {
    private Html html;

    public HtmlToPdf(Html html) {
        this.html = html;
    }

    @Override
    public void convert() {
        html.convert();
        System.out.println("W trakcie konwersji");
    }
}
