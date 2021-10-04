package lab2;
import java.util.ArrayList;

/**
 * SubChapter
 */
public class SubChapter {
    private String name;
    private ArrayList<Element> elements;

    public SubChapter(String name) {
        this.name = name;
        this.elements = new ArrayList<Element>();
    }

    public void addElement(Element element) {
        this.elements.add(element);   
    }


    public void print() {
        System.out.println("Subchapter " + this.name);

        for (Element element : this.elements)
            element.print();
    }
}