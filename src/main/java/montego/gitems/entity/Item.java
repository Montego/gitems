package montego.gitems.entity;

import com.sun.jmx.snmp.Timestamp;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private User user;

    private String name;

    private Timestamp year;

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
