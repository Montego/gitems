package montego.gitems.entity;

import com.sun.jmx.snmp.Timestamp;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

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

    @ManyToMany
    @JoinTable(
            name = "item_types",
            joinColumns = {@JoinColumn(name = "item_id")},
            inverseJoinColumns = {@JoinColumn(name = "type_id")}
    )
    private Set<ItemType> types = new HashSet<>();


    @ManyToMany
    @JoinTable(
            name = "item_categories",
            joinColumns = {@JoinColumn(name = "item_id")},
            inverseJoinColumns = {@JoinColumn(name = "category_id")}
    )
    private Set<ItemCategory> categories = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "item_genres",
            joinColumns = {@JoinColumn(name = "item_id")},
            inverseJoinColumns = {@JoinColumn(name = "genres_id")}
    )
    private Set<ItemGenre> genres = new HashSet<>();

    private String comment;

    private int score;

    private boolean isPrivate;

    private boolean isChecked;

    private boolean isImportant;

    private String tag;

}
