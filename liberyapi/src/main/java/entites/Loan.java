package entites;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

@Entity
public class Loan {
    private String id;
    private String borrowerName;
    private LocalDate loanDate;
    private LocalDate returnDate;

    @ManyToOne
    private Book book;

    public Loan(String id, LocalDate returnDate, LocalDate loanDate, String borrowerName) {
        this.id = id;
        this.returnDate = returnDate;
        this.loanDate = loanDate;
        this.borrowerName = borrowerName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }
}

/*
Controller
Service
Repository
DTO
Mapper
Entity
Report
 */