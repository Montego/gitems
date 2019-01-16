package montego.gitems.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Data
@Entity
public class ItemCategory {
    public ItemCategory() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Category can't be empty")
    private String itemCategoryName;

//    @OneToMany(mappedBy = "genreName", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private Set<ItemGenre> itemGenres;

}
