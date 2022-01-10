package ro.uvt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import ro.uvt.models.*;
import ro.uvt.services.*;

@SpringBootApplication
public class Main {
    public static void main(String[] args) throws Exception {
//        OpenCommand openCommand = new OpenCommand("Title1");
//
//        Section sectionToSave = new Section("Capitol 14");
//        sectionToSave.add(new Paragraph("Acesta este un capitol"));
//        SaveCommand saveCommand = new SaveCommand(sectionToSave);
//
//        StatisticsCommand statisticsCommand = new StatisticsCommand();
//
//        openCommand.execute();
//        saveCommand.execute();
//        statisticsCommand.execute();

        SpringApplication.run(Main.class, args);
    }

//    @EventListener(ApplicationReadyEvent.class)
//    public void doSomethingAfterStartup() {
//        System.out.println("hello world, I have just started up");
//    }
}