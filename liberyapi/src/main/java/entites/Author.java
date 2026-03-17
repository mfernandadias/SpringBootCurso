package entites;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;


@Entity
public class Author {

   private Long id;
   private String name;
   private String nationality;
   private LocalDate birthDate;

   @OneToMany(mappedBy = "author")
   private List<Book> books;
   public Author(){}

    public Author(Long id, LocalDate birthDate, String nationality, String name) {
        this.id = id;
        this.birthDate = birthDate;
        this.nationality = nationality;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
