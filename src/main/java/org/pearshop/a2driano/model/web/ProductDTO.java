package org.pearshop.a2driano.model.web;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.pearshop.a2driano.model.Category;
import org.pearshop.a2driano.model.Color;

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
    private String communicator;
    private Color color;
    private Double camera;
    private Double price;
    private Integer quantity;
    private Integer count;

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

    public String getCommunicator() {
        return communicator;
    }

    public void setCommunicator(String communicator) {
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
}
