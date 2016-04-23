package org.pearshop.a2driano.model;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 23.04.2016
 */
public enum Status {
    ACTIVE("active"),
    COMPLETED("completed"),
    CANCELED("canceled");

    private Status(String status) {
        this.status = status;
    }

    private String status;

    public String getStatus() {
        return status;
    }
}
