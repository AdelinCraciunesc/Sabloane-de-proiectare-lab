package ro.uvt.models;

import ro.uvt.services.*;

public class ImageProxy implements Element,Picture,Visitee{
    private String url;

    private Dimension dim = new Dimension(300, 300);
    private Image img;

    public ImageProxy(String url) {
        this.url = url;
    }

    public Image loadImage() {
        if(this.img==null)
        {
            this.img = new Image(url);
        }
        return this.img;
    }

    public String getUrl() {
        return url;
    }

    public Dimension getDim() {
        return dim;
    }

    @Override
    public String url() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Dimension dim() {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public void add(Element element) throws Exception {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void remove(Element element) {
        // TODO Auto-generated method stub
        
    }
    public boolean find(Element element) {
        return false;
    }

    public void accept(Visitor visitor) {
        visitor.visitImageProxy(this);
    }
}
