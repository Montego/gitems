package montego.gitems.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="usr")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    
}

