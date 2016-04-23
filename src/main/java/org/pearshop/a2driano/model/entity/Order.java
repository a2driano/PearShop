package org.pearshop.a2driano.model.entity;

import org.pearshop.a2driano.model.Status;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 23.04.2016
 */
@Entity
@Table(name = "order")
public class Order {
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private int phone;
    private String description;
    private Date date;
    private Product product;
    private Status status;
}
