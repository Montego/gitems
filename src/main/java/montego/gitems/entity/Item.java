package montego.gitems.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonView;
import com.sun.jmx.snmp.Timestamp;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@Getter
@Setter
@Entity
public class Item {
    public Item() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(updatable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime creationDate;
    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

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
