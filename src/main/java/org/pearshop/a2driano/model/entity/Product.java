package org.pearshop.a2driano.model.entity;

import org.pearshop.a2driano.model.Category;
import org.pearshop.a2driano.model.Color;
import org.pearshop.a2driano.model.Communicator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 23.04.2016
 */
@Entity
@Table(name = "product")
@NamedQueries({
        @NamedQuery(name = "GetAllProducts", query = "SELECT a FROM Product a")
})
public class Product implements Serializable {
    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "article", columnDefinition = "VARCHAR(25)", nullable = false, unique = true)
    private Integer article;

    @Column(name = "category", nullable = false, length = 25)
    @Enumerated(EnumType.STRING)
    private Category category;

    @Column(name = "name", nullable = false, unique = false, length = 255)
    private String name;

    @Column(name = "description", length = 500)
    private String description;

    @Column(name = "screen")
    private Double screen;

    @Column(name = "memory", length = 20)
    private Integer memory;

    @Column(name = "communicator", length = 20)
    @Enumerated(EnumType.STRING)
    private Communicator communicator;

    @Column(name = "color", length = 20)
    @Enumerated(EnumType.STRING)
    private Color color;

    @Column(name = "camera", length = 10)
    private Double camera;

    @Column(name = "price")
    private Double price;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "count", nullable = true)
    private Integer count;

    @OneToMany(mappedBy = "product")
    private List<UserOrder> userOrders;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArticle() {
        return article;
    }

    public void setArticle(Integer article) {
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

    public Double getScreen() {
        return screen;
    }

    public void setScreen(Double screen) {
        this.screen = screen;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public Communicator getCommunicator() {
        return communicator;
    }

    public void setCommunicator(Communicator communicator) {
        this.communicator = communicator;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Double getCamera() {
        return camera;
    }

    public void setCamera(Double camera) {
        this.camera = camera;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<UserOrder> getUserOrders() {
        return userOrders;
    }

    public void setUserOrders(List<UserOrder> userOrders) {
        this.userOrders = userOrders;
    }
}