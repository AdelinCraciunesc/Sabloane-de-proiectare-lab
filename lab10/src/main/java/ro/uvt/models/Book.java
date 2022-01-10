package ro.uvt.models;

import javax.persistence.*;
import ro.uvt.services.*;
import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book implements Visitee {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "title")
    private String title;

    private ArrayList<Element> elements;

    @ManyToOne(targetEntity = Author.class)
    private ArrayList<Author> authors;

    public Book(String title) {
        this.title = title;
        this.elements = new ArrayList<Element>();
        this.authors = new ArrayList<Author>();
    }

    public void addContent (Element element) {
        this.elements.add(element);
    }

    public void addAuthor (Author author) {
        this.authors.add(author);
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Element> getElements() {
        return elements;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBook(this);
    }

    public void setId(Long id) {
        this.id = id;
    }
}