package lab2;
import java.util.ArrayList;

public class Chapter {
    private String title;
    private ArrayList<SubChapter> subChapters;

    public Chapter(String title){
        this.title = title;
        this.subChapters = new ArrayList<>();
    }

    public int addSubChapter(String subChapter) {
        this.subChapters.add(new SubChapter(subChapter));

        return this.subChapters.size() - 1;
    }

    public SubChapter getSubChapter(int index) {
        return this.subChapters.get(index);
    }

    public void print() {
        System.out.println("Chapter titke: " + title);
        for (SubChapter subChapter : subChapters) {
            System.out.println(subChapter);
        }
        
    }
}
