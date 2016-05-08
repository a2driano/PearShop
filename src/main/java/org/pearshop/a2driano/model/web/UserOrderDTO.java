package org.pearshop.a2driano.model.web;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.pearshop.a2driano.model.Status;
import org.pearshop.a2driano.model.entity.CountProduct;
import java.util.Date;
import java.util.List;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 23.04.2016
 */
@JsonAutoDetect
public class UserOrderDTO {
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String description;
    private Date date;
    private Status status;
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
