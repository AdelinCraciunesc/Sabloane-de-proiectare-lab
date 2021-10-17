package lab3;
public class Image implements Element{

    private String imageName;

    public Image(String imageName){
        this.imageName = imageName;
    }

    public void add(Element element) {
        //later
    }

    public void remove(Element element) {
        //later
    }

    public boolean find(Element element) {
        if (!(element instanceof Image))
            return false;
        else {
            return ((Image) element).imageName.equals(this.imageName);
        }
    }

    public void print() {
        System.out.println("Image with name" + this.imageName);
    }
}
