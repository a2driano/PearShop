package org.pearshop.a2driano.model.entity;

import org.hibernate.annotations.GenericGenerator;
import org.pearshop.a2driano.model.Status;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 23.04.2016
 */
@Entity
@Table(name = "userorder")
@NamedQueries({
        @NamedQuery(name = "GetAllUserOrder", query = "SELECT a FROM UserOrder a")
})
public class UserOrder implements Serializable {
    @Id
    @Column(name = "order_id")
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @GenericGenerator(name="kaugen" , strategy="increment")
    @GeneratedValue(generator="kaugen")
    private Integer id;

    @Column(name = "firstname", unique = false, nullable = false, length = 100)
    private String firstname;

    @Column(name = "lastname", unique = false, length = 100)
    private String lastname;

    @Column(name = "email", unique = false, nullable = false, length = 100)
    private String email;

    @Column(name = "phone", unique = false, nullable = false, length = 12)
    private String phone;

    @Column(name = "description", length = 500)
    private String description;

    @Column(name = "date")
    @Temporal(value = TemporalType.DATE)
    private Date date;

    @Column(name = "status", length = 25)
    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToMany(mappedBy = "userOrder")
    private List<CountProduct> countProductList;

    public List<CountProduct> getCountProductList() {
        return countProductList;
    }

    public void setCountProductList(List<CountProduct> countProductList) {
        this.countProductList = countProductList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
