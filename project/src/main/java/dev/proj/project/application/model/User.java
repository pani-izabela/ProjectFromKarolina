package dev.proj.project.application.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

//@NamedQuery(name = "User.retriveUsers", query = "FROM User")
//@NamedQuery(name = "User.retriveUser", query = "FROM User WHERE id = :ID")
@NamedQueries({
        @NamedQuery(name = User.GET_USER_BY_ID, query = User.QUERY_GET_USER_BY_ID),
        @NamedQuery(name = "User.retriveUsers", query = "FROM User"),
@NamedQuery(name = "User.retriveUser", query = "FROM User WHERE id = :ID")

})

@Entity
@Table(name = "USERS")
@Getter
@Setter
@NoArgsConstructor
public class User {

    public static final String GET_USER_BY_ID = "User.get_user_by_id";
    public static final String QUERY_GET_USER_BY_ID = "select u from User u where u.id = :id";


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name="ID")
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private String pass;

}
