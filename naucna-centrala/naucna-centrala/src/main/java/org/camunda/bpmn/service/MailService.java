package org.camunda.bpmn.service;

import org.camunda.bpmn.model.Author;
import org.camunda.bpmn.model.Editor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private Environment environment;

    public void sendNotification(Author author, Editor chiefEditor) {

        SimpleMailMessage mailAuthor = new SimpleMailMessage();
        System.out.println(chiefEditor.getTitle());
        mailAuthor.setTo("majsta993@gmail.com");
        mailAuthor.setFrom(environment.getProperty("spring.mail.username"));
        mailAuthor.setSubject("Nov rad");
        mailAuthor.setText("Zdravo " + author.getFirstName() + ",\n\nuspešno ste prijavili rad.");

        SimpleMailMessage mailEditor = new SimpleMailMessage();
        mailEditor.setTo("majsta00@gmail.com");
        mailEditor.setFrom(environment.getProperty("spring.mail.username"));
        mailEditor.setSubject("Nov rad");
        mailEditor.setText("Zdravo " + chiefEditor.getFirstName() + ",\n\nobaveštavamo Vas da je u sistemu prijavljen nov rad za časopis.");


        javaMailSender.send(mailAuthor);
        javaMailSender.send(mailEditor);
    }

    public void notifyScienceFieldEditor(Editor editor) {
        SimpleMailMessage mailEditor = new SimpleMailMessage();
        mailEditor.setTo("majsta993@gmail.com");
        mailEditor.setFrom(environment.getProperty("spring.mail.username"));
        mailEditor.setSubject("Nov rad");
        mailEditor.setText("Zdravo " + editor.getFirstName() + ",\n\nobaveštavamo Vas da je u sistemu prijavljen nov rad.");
        javaMailSender.send(mailEditor);
    }

    public void notifyAboutAcceptance(Author author) {
        SimpleMailMessage mailAuthor = new SimpleMailMessage();
        mailAuthor.setTo("majsta993@gmail.com");
        mailAuthor.setFrom(environment.getProperty("spring.mail.username"));
        mailAuthor.setSubject("Odluka o prihvaćanju rada");
        mailAuthor.setText("Zdravo " + author.getFirstName() + ",\n\nobaveštavamo Vas da je rad koji ste priložili prihvaćen od strane glavnog urednika.");
        javaMailSender.send(mailAuthor);
    }

    public void notifyAboutRefusal(Author author) {
        SimpleMailMessage mailAuthor = new SimpleMailMessage();
        mailAuthor.setTo("majsta993@gmail.com");
        mailAuthor.setFrom(environment.getProperty("spring.mail.username"));
        mailAuthor.setSubject("Odluka o prihvaćanju rada");
        mailAuthor.setText("Zdravo " + author.getFirstName() + ",\n\nnažalost Vas obaveštavamo da je rad koji ste priložili odbijen od strane glavnog urednika.");
        javaMailSender.send(mailAuthor);
    }

    public void correctionNotification(Author author) {
        SimpleMailMessage mailAuthor = new SimpleMailMessage();
        mailAuthor.setTo("majsta993@gmail.com");
        mailAuthor.setFrom(environment.getProperty("spring.mail.username"));
        mailAuthor.setSubject("Ispravka rada");
        mailAuthor.setText("Zdravo " + author.getFirstName() + ",\n\nobaveštavamo Vas da rad koji ste priložili zahteva ispravke i potrebno je priložiti nov PDF. Imate 24h da ispravite rad.");
        javaMailSender.send(mailAuthor);
    }
}
