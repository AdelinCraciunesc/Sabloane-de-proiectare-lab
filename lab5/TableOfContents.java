package lab5;
/**
 * TableOfContents
 */
public class TableOfContents implements Element{
    private String title;

    public TableOfContents(String title)
    {
        this.title=title;
    }

    public void print() {
        //empty
    }

    public void add(Element element) {
        //later
    }

    public void remove(Element element) {
        //later
    }

    public boolean find(Element element) {
        //not needed
        return false;
    }

    public Element clone() {
        TableOfContents newtoc=new TableOfContents(this.title);
        return newtoc;
     }
}