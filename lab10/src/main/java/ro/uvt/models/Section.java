package ro.uvt.models;
import java.util.ArrayList;
import java.util.Collections;

import ro.uvt.services.*;

public class Section implements Element,Visitee{
    private String title;
    private ArrayList<Element> elements = new ArrayList<>();

    private Long id;

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
        this.elements.add(element);
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

//    public Element clone() {
//        Section newclone = new Section(this.title);
//
//        for(Element el : this.elements)
//        {
//            newclone.add(el.clone());
//        }
//
//        return newclone;
//    }

    //    public void print() {
    //        System.out.println("Title" + this.title);
    //
    //        for (Element e : this.elements)
    //            e.print();
    //    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Element> getElements() {
        return elements;
    }

    public void accept(Visitor visitor) {
        visitor.visitSection(this);
    }
}
