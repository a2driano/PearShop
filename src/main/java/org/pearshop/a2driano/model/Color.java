package org.pearshop.a2driano.model;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 23.04.2016
 */
public enum Color {
    SPACEGRAY("space gray"),
    GRAY("gray"),
    SILVER("silver"),
    GOLD("gold"),
    ROSEGOLD("rose gold"),
    SPACEBLACK("space black"),
    PEARL("pearl");

    private String color;

    private Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
