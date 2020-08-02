package pl.sda.JobOfferApplication.user.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@ToString
public class UserInput {

    private String name;
    private String login;
    private LocalDate creationDate;
    private String password;

    private UserInput() {
        creationDate = LocalDate.now();
    }
}
