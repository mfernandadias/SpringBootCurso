package mfernandas.TodoList.demo.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.aot.generate.Generated;

@Entity
public class Task {

    @Id
    //@Generated(strategy = GenerationType.IDENTITY)
    //this is the primary key whith will be auto generated
    private Long id;
    private String task;
    private boolean completed;

    public Task(String task, boolean completed){
        this.task = task;
        this.completed = completed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
