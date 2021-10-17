package lab3;

public class Table implements Element{
    private String title;

    public Table(String title){
        this.title = title;
    }

    public void add(Element element) {
        //later
    }

    public void remove(Element element) {
        //later
    }

    public boolean find(Element element) {
        if (!(element instanceof Table))
            return false;
        else {
            return ((Table) element).title.equals(this.title);
        }
    }

    public void print() {
        System.out.println("Table with Title" + this.title);
    }
}
