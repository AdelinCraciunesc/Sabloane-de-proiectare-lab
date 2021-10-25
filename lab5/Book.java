package lab5;

import java.util.ArrayList;

public class Book {

    private String title;
    private ArrayList<Author> authors;
    private ArrayList<Element> elements; 
    
    public Book(String title){
        this.title = title;
        this.authors = new ArrayList<>();
        this.elements = new ArrayList<>();
    }

    public void addContent (Element element) {
        this.elements.add(element);
    }

    public void addAuthor(Author author) {
        this.authors.add(author);  
    }

    public void print() {
        System.out.println("Book: " + title);
        
        for (Author author : this.authors) {
            author.print();
        }
        for (Element chapter : elements) {
            chapter.print();
        }
    }
}