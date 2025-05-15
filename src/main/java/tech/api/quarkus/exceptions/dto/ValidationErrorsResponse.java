package tech.api.quarkus.exceptions.dto;

import io.quarkus.runtime.annotations.RegisterForReflection;

import java.util.List;

public class ValidationErrorsResponse {

    private String field;
    private int status;
    private List<Violation> message;

    public ValidationErrorsResponse(){}

    public ValidationErrorsResponse(String field, int status, List<Violation> message){
        this.field = field;
        this.status = status;
        this.message = message;
    }

    public List<Violation> getMessage() {
        return message;
    }

    public void setMessage(List<Violation> message) {
        this.message = message;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
