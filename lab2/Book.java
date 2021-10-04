package lab2;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title;
    private ArrayList<Author> authors;
    private List<Chapter> chapters; 
    private TableOfContents toc;
    
    public Book(String title){
        this.title = title;
        this.authors = new ArrayList<>();
        this.chapters = new ArrayList<>();
        this.toc = new TableOfContents();
    }

    public int addChapter (String chapter) {
        this.chapters.add(new Chapter(chapter));

        return this.chapters.size() - 1;
    }

    public Chapter getChapterByIndex (int index) {
        return this.chapters.get(index);
    }

    public void addAuthor(Author author) {
        this.authors.add(author);  
    }

    public void print() {
        System.out.println("Book: " + title);
        
        for (Author author : this.authors) {
            author.print();
        }
        for (Chapter chapter : chapters) {
            chapter.print();
        }
    }
}