package dev.proj.project.application.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NamedQueries({
        @NamedQuery(name = Userview.GET_USER_BY_USERID, query = Userview.QUERY_GET_USER_BY_USERID),
        @NamedQuery(name = Userview.GET_ADRESS_BY_ADRESSID, query = Userview.QUERY_GET_ADRESS_BY_ADRESSID)
})

@Entity
@Table(name = "USERVIEW")
@Getter
@Setter
@NoArgsConstructor
public class Userview {

    public static final String GET_USER_BY_USERID = "Userview.get_user_by_userid";
    public static final String QUERY_GET_USER_BY_USERID = "select u from Userview u where u.user_id = :userId";

    public static final String GET_ADRESS_BY_ADRESSID = "Userview.get_adress_by_adressid";
    public static final String QUERY_GET_ADRESS_BY_ADRESSID = "select u from Userview u where u.adress_id = :adressId";

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "user_id")
    private Integer user_id;

    @Column(name = "adress_id")
    private Integer adress_id;

    @Column(name = "home_id")
    private Integer home_id;

    @Column(name = "street")
    private String street;

    @Column(name = "home")
    private String home;

    @Column(name = "flat")
    private String flat;

    @Column(name = "code")
    private String code;

    @Column(name = "city")
    private String city;

    @Column(name = "area")
    private String area;

    @Column(name = "price")
    private String price;

    @Column(name = "home_type")
    private String type;
}
