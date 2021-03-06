package ro.uvt.models;

import java.util.concurrent.TimeUnit;

import ro.uvt.services.*;

public class Image implements Element,Picture,Visitee{
    private String imageName;
    private Dimension dim = new Dimension(40,60);
    private ImageLoader content;
    private ImageLoaderFactory imageFactory = new ImageLoaderFactory();

    public void loadContent() throws Exception {
        content = imageFactory.create(imageName);
    }
    
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
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
        return false;
    }

    @Override
    public String url() {
        return this.imageName;
    }

    @Override
    public Dimension dim() {
        return this.dim;
    }

    public ImageLoader getContent() {
        return content;
    }

    public ImageLoaderFactory getImageFactory() {
        return imageFactory;
    }

    @Override
    public void accept(Visitor visitor) {
        //TODO Auto-generated method stub
        visitor.visitImage(this);
    }
}
