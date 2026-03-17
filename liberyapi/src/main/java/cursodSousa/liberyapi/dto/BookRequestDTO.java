package cursodSousa.liberyapi.dto;

import entites.Book;

public class BookRequestDTO {

    public String title;
    public String isbn;
    public Integer publicationYear;
    public Integer totalCopies;
    public Long authorId;

    public BookRequestDTO(Book book ) {
        this.title = book.getTitle();
        //this.authorId = book.getId();
        this.totalCopies = book.getTotalCopies();
        this.publicationYear = book.getPublicationYear();
        this.isbn = book.getIsbn();
    }
}
