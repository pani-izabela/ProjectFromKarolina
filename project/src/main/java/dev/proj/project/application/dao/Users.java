package dev.proj.project.application.dao;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "USERS")
@Getter
@Setter
@NoArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name="ID")
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private String pass;

}
