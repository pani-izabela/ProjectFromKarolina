package dev.proj.project.application.model;

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
    private Integer idAdress;
    private String street;
    private String nrHome;
    private String nrFlat;
    private String postalCode;
    private String city;
    @JoinColumn(name = "HOME_ID")
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Home home;
    @JoinColumn(name = "USER_ID")
    @ManyToOne()
    private User user;
}
