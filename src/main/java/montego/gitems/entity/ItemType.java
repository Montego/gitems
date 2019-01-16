package montego.gitems.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
public class ItemType {
    public ItemType() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Type can't be empty")
    private String itemTypeName;

//    @OneToOne(mappedBy = "itemCategoryName", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private ItemCategory itemCategory;

}
