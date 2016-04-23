package org.pearshop.a2driano.model.entity;

import org.pearshop.a2driano.model.Category;
import org.pearshop.a2driano.model.Color;
import org.pearshop.a2driano.model.Communicator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 23.04.2016
 */
@Entity
@Table(name = "product")
public class Product implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "article", nullable = false, unique = true)
    private int article;

    @Column(name = "category", columnDefinition = "VARCHAR(15)")
    @Enumerated(EnumType.STRING)
    private Category category;

    @Column(name = "name", nullable = false, unique = false, columnDefinition = "VARCHAR(255)")
    private String name;

    @Column(name = "description", columnDefinition = "VARCHAR(500)")
    private String description;

    @Column(name = "screen")
    private double screen;

    @Column(name = "memory")
    private int memory;

    @Column(name = "communicator", columnDefinition = "VARCHAR(20)")
    @Enumerated(EnumType.STRING)
    private Communicator communicator;

    @Column(name = "color", columnDefinition = "VARCHAR(20)")
    @Enumerated(EnumType.STRING)
    private Color color;

    @Column(name = "camera")
    private double camera;

    @Column(name = "price")
    private double price;

    @Column(name = "quantity")
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getScreen() {
        return screen;
    }

    public void setScreen(double screen) {
        this.screen = screen;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getCamera() {
        return camera;
    }

    public void setCamera(double camera) {
        this.camera = camera;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Communicator getCommunicator() {
        return communicator;
    }

    public void setCommunicator(Communicator communicator) {
        this.communicator = communicator;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

}
