package org.pearshop.a2driano.model.web;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 22.05.2016
 */
public class JsonResponse {
    private String status = null;
    private Object result = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
