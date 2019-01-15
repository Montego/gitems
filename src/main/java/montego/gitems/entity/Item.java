package montego.gitems.entity;

import com.sun.jmx.snmp.Timestamp;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
public class Item {
    public Item() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User author;

    @NotBlank(message = "Can't be empty!")
    private String name;

    private Timestamp year;

    @OneToOne(mappedBy = "itemTypeName", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private ItemType itemType;

    private ItemCategory itemCategory;

    private ItemGenre itemGenre;

    private String comment;

    private int score;

    private boolean isPrivate;

    private boolean isChecked;

    private boolean isImportant;

    private String tag;

}
