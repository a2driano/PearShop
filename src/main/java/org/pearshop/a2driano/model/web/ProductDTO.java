package org.pearshop.a2driano.model.web;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.pearshop.a2driano.model.Category;
import org.pearshop.a2driano.model.Color;
import org.pearshop.a2driano.model.Communicator;
import org.pearshop.a2driano.model.entity.CountProduct;

import java.util.List;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 23.04.2016
 */
@JsonAutoDetect
public class ProductDTO {
    private Integer id;
    private Integer article;
    private Category category;
    private String name;
    private String description;
    private Double screen;
    private Integer memory;
    private Communicator communicator;
    private Color color;
    private Double camera;
    private Double price;
    private Integer quantity;
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
}
