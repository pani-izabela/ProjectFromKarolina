package dev.proj.project.application.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NamedQueries({
        @NamedQuery(name = Adress.GET_ADRESS_BY_STREET_AND_NRHOME_AND_NRFLAT_AND_CITY,
                query = Adress.QUERY_GET_ADRESS_BY_STREET_AND_NRHOME_AND_NRFLAT_AND_CITY)
})

@Entity
@Table(name = "ADRESS")
@Getter
@Setter
@NoArgsConstructor
public class Adress {

    public static final String GET_ADRESS_BY_STREET_AND_NRHOME_AND_NRFLAT_AND_CITY = "Adress.get_adress_by_street_and_nrhome_and_nrflat_and_city";
    public static final String QUERY_GET_ADRESS_BY_STREET_AND_NRHOME_AND_NRFLAT_AND_CITY = "select a from Adress a where a.street = :street and a.nrHome = :nrhome and a.nrFlat = :nrflat and a.city = :city";

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
