package lab9.services;

import lab9.models.Section;
import lab9.models.Paragraph;

public class SaveCommand implements Command{
    private Section section;

    public SaveCommand(Section section) {
        this.section = section;
    }
    
    public void execute() throws Exception {
        this.section.add(new Paragraph("Ceva!"));

        DocumentManager.getInstance().getBook().addContent(this.section);
    }
}
