package org.pearshop.a2driano.model;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 23.04.2016
 */
public enum Category {
    IPAD("ipad"),
    IPHONE("iphone");

    private String category;

    private Category(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
