package ro.uvt.models;

import lombok.NoArgsConstructor;
import ro.uvt.services.*;

import javax.persistence.*;

public class Paragraph implements Element,Visitee{
    private String text;

    private AlignStrategy align;

    private Long id;

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
        return false;
    }

    public String getText() {
        return text;
    }

    public AlignStrategy getAlignStrategy() {
        return align;
    }

    public void setAlign(AlignStrategy align) {
        this.align = align;
    }


    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }
}
