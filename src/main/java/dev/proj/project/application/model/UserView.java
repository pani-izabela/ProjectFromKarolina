package dev.proj.project.application.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "USERVIEW")
@Getter
@Setter
@NoArgsConstructor
public class UserView {
    private Integer id;
    private Integer id_adress;
    private Integer id_home;
}
