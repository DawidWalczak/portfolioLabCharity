package pl.coderslab.charity.Entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Setter
@Getter
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantity; // liczba workow
    @ManyToMany
    private List<Category> categories; //ubrania, zabwki
    @ManyToOne
    private Institution institution; //nazwa dotacji, opis dotacji
    private String  street; //ulica
    private String  city; //miasto
    private String  zipCode; //kod pocztowy
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate pickUpDate; //data odbioru
    private LocalTime pickUpTime; //czas odbioru
    private String  pickUpComment;
}
