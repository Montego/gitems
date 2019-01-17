package montego.gitems.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
public class ItemGenre {
    public ItemGenre() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String itemGenreName;

//    @NotBlank(message = "Genre can't be empty")
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "itemCategory_id")
//    private String genreName;
}
