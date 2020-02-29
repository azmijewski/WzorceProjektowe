package adapter.fileConvertion;

public class DocToPdf implements Converter {
    private Doc doc;

    public DocToPdf(Doc doc) {
        this.doc = doc;
    }

    @Override
    public void convert() {
        doc.convert();
        System.out.println("W trakcie konwersji");
    }
}
