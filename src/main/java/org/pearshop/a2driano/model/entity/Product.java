package org.pearshop.a2driano.model.entity;

import org.pearshop.a2driano.model.Category;
import org.pearshop.a2driano.model.Color;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 23.04.2016
 */
@Entity
@Table(name = "product")
public class Product {
    private int id;
    private int article;
    private Category category;
    private String name;
    private double screen;
    private int memory;
    private String communicator;
    private Color color;
    private int camera;
    private double price;
    private int quantity;

}
