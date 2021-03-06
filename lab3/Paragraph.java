package lab3;
public class Paragraph implements Element{
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public Paragraph(Paragraph paragraph) {
        this.text = paragraph.text;
    }

    public void add(Element element) {
        //later
    }

    public void remove(Element element) {
        //later
    }

    public boolean find(Element element) {
        if (!(element instanceof Paragraph))
            return false;
        else {
            return ((Paragraph) element).text.equals(this.text);
        }
    }

    public void print() {
        System.out.println("Paragraph" + this.text);
    }

    public Element clone() {
        Paragraph newparagraph = new Paragraph(this.text);
        return newparagraph;
    }
    
}
