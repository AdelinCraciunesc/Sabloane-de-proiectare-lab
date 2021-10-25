package lab5;
public class Paragraph implements Element{
    private String text;
    private AlignStrategy align;

    public Paragraph(String text) {
        this.text = text;
    }

    public void add(Element element) {
        //later
    }

    public void setAlignStrategy(AlignStrategy align) {
        this.align = align;
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

    public Element clone() {
        Paragraph newparagraph = new Paragraph(this.text);
        return newparagraph;
    }

    public void print() {
        if (this.align!=null) {
            this.align.render(this, null);
        }
        System.out.println("Paragraph" + this.text);
    }
    
}
