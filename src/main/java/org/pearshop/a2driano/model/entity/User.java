package org.pearshop.a2driano.model.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 16.05.2016
 */
@Entity
@Table(name = "users")
@NamedQueries({
//        @NamedQuery(name = "getAllUsers", query = "SELECT a FROM User a"),
        @NamedQuery(name = "GetUserByLogin", query = "SELECT a FROM User a WHERE a.login= :login")
})
public class User {
    @Id
    @Column(name = "id")
    @GenericGenerator(name = "kaugen", strategy = "increment")
    @GeneratedValue(generator = "kaugen")
    private Integer id;
    @Column(name = "login", unique = true, nullable = false, length = 50)
    private String login;
    @Column(name = "password", unique = true, nullable = false, length = 50)
    private String password;
    @Column(name = "role", nullable = false)
    @Enumerated(EnumType.STRING)
    private UserRole userRole;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }
}
