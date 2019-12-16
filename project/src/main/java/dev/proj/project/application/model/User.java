package dev.proj.project.application.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NamedQuery(name = "User.retriveUsers", query = "FROM User")
@NamedQuery(name = "User.retriveUser", query = "FROM User WHERE id = :ID")
@Entity
@Table(name = "USERS")
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name="ID")
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private String pass;

}
