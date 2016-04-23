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
    private int id;
    private int article;
    private Category category;
    private String name;
    private String description;
    private double screen;
    private int memory;
    private String communicator;
    private Color color;
    private double camera;
    private double price;
    private int quantity;
//    private Order order;

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

//    public Order getOrder() {
//        return order;
//    }
//
//    public void setOrder(Order order) {
//        this.order = order;
//    }
}
