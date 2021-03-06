package lab3;
import java.util.ArrayList;
import java.util.Collections;

public class Section implements Element{
    private String title;
    private ArrayList<Element> elements;

    public Section(String title){
        this.title = title;
        this.elements = new ArrayList<Element>();
    }

    public Section(Section section) {
        this.title = section.title;
        this.elements = new ArrayList<>();
        Collections.copy(this.elements, section.elements);
    }

    public void add(Element element){
        this.elements.add(element.clone());
    }

    public void remove(Element element) {
        this.elements.remove(element);
    }

    public boolean find(Element element) {
        for (Element e : this.elements) {
            if (e.find(element))
                return true;
        }

        return false;
    }

    public void print() {
        System.out.println("Title" + this.title);
        
        for (Element e : this.elements)
            e.print();  
    }

    public Element clone() {
        Section newclone = new Section(this.title);

        for(Element el : this.elements)
        {
            newclone.add(el.clone());
        }

        return newclone;
    }
}
