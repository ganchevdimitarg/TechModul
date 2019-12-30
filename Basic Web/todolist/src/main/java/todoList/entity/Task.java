package todoList.entity;

import javax.persistence.*;

@Entity
public class Task {
    private Long id;
    private String title;
    private String comments;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(columnDefinition = "LONGTEXT")
    public String getComments() {
        return comments;
    }


    public void setComments(String comments) {
        this.comments = comments;
    }
}
