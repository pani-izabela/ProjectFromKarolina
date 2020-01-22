package dev.proj.project.application.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "HOME")
@Getter
@Setter
@NoArgsConstructor
public class Home {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Integer id;
    private Double area;
    private Double price;
    private String typeHome;
}
