package org.pearshop.a2driano.model;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 23.04.2016
 */
public enum Communicator {
    WIFI("wi-fi"),
    LTE("lte");

    private String communicator;

    private Communicator(String communicator) {
        this.communicator = communicator;
    }

    public String getCommunicator() {
        return communicator;
    }
}
