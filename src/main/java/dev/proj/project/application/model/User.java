package dev.proj.project.application.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NamedQueries({
        @NamedQuery(name = User.GET_USER_BY_ID, query = User.QUERY_GET_USER_BY_ID),
        @NamedQuery(name = User.GET_USERS, query = User.QUERY_GET_USERS),
        @NamedQuery(name = User.GET_USER_BY_EMAIL_AND_PASS, query = User.QUERY_GET_USER_BY_EMAIL_AND_PASS)
})

@Entity
@Table(name = "USERS")
@Getter
@Setter
@NoArgsConstructor
public class User {

    public static final String GET_USER_BY_ID = "User.get_user_by_id";
    public static final String QUERY_GET_USER_BY_ID = "select u from User u where u.id = :id";

    public static final String GET_USERS = "User.get_users";
    public static final String QUERY_GET_USERS = "select u from User u";

    public static final String GET_USER_BY_EMAIL_AND_PASS = "User.get_user_by_name_and_email";
    public static final String QUERY_GET_USER_BY_EMAIL_AND_PASS = "select u from User u where u.email = :email and u.pass = :pass";


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name="ID")
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private String pass;

}
