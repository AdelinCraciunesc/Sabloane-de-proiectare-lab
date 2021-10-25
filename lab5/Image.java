package lab5;

import java.util.concurrent.TimeUnit;

public class Image implements Element,Picture{

    private String imageName;
    private Dimension dim = new Dimension(40,60);
    private ImageLoader content;
    private ImageLoaderFactory imageFactory = new ImageLoaderFactory();

    public void loadContent() throws Exception {
        content = imageFactory.create(imageName);
    }
    
    public Image(String imageName){
        this.imageName = imageName;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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

    public Element clone() {
        Image newimage = new Image(this.imageName);
        return newimage;
    }

    @Override
    public String url() {
        return this.imageName;
    }

    @Override
    public Dimension dim() {
        return this.dim;
    }
}
