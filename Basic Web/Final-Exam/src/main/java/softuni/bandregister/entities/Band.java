package softuni.bandregister.entities;

import javax.persistence.*;


@Entity
@Table(name = "bands")
public class Band {
    private Integer id;
    private String name;
    private String members;
    private Double honorarium;
    private String genre;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Column(nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(nullable = false)
    public String getMembers() {
        return members;
    }

    public void setMembers(String members) {
        this.members = members;
    }
    @Column(nullable = false)
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getHonorarium() {
        return honorarium;
    }

    public void setHonorarium(Double honorarium) {
        this.honorarium = honorarium;
    }

    public Band(String name, String members, String genre, Double honorarium) {
        this.name = name;
        this.members = members;
        this.genre = genre;
        this.honorarium = honorarium;
    }

    public Band() {
    }
}
