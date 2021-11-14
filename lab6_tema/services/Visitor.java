package lab6_tema.services;

import lab6_tema.models.Book;
import lab6_tema.models.Section;
import lab6_tema.models.TableOfContents;
import lab6_tema.models.Paragraph;
import lab6_tema.models.ImageProxy;
import lab6_tema.models.Image;
import lab6_tema.models.Table;

public interface Visitor {
    void visitBook(Book book);
    void visitSection(Section section);
    // T visitTableOfContents(TableOfContents toc);
    void visitTableOfContents(TableOfContents toc);
    void visitParagraph(Paragraph paragraph);
    void visitImageProxy(ImageProxy imageProxy);
    void visitImage(Image image);
    void visitTable(Table table);
}
