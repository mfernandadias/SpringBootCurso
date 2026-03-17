package cursodSousa.liberyapi.dto;

import entites.Author;

import java.time.LocalDate;

public class AutorDTO {
    //AuthorRequestDTO
    public Long id;
    public String name;
    public String nationality;
    public LocalDate birthDate;

    public AutorDTO(Author author) {
        this.id = author.getId();
        this.birthDate = author.getBirthDate();
        this.nationality = author.getNationality();
        this.name = author.getName();
    }

}
