package lab6_tema.models;;
public interface Element {
    void print();
    void add(Element element) throws Exception;
    void remove(Element element);
    boolean find(Element element);
    Element clone();
}