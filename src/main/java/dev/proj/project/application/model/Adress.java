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
    @JsonIgnore
    @JoinColumn(name = "HOME_ID")
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Home home;
    @JsonIgnore
    @JoinColumn(name = "USER_ID")
    @ManyToOne()
    private User user;
}
