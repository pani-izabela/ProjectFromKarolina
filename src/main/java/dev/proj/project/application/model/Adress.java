package dev.proj.project.application.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ADRESS")
@Getter
@Setter
@NoArgsConstructor
public class Adress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String street;
    private String nrHome;
    private String nrFlat;
    private String postalCode;
    private String city;
    @JoinColumn(name = "HOME_ID")
    @OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private Home home;
    @JoinColumn(name = "USER_ID")
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private User user;
}
