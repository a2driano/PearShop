package org.pearshop.a2driano.model.web;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.pearshop.a2driano.model.Status;
import org.pearshop.a2driano.model.entity.Product;

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
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private int phone;
    private String description;
    private List<Product> product;
    private Status status;
    private Date date;

}
