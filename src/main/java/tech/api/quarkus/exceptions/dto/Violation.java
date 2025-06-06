package tech.api.quarkus.exceptions.dto;

public class Violation {

    private String field;
    private String message;

    public Violation(){}
    public Violation(String field, String message){
        this.field = field;
        this.message = message;
    }

    public String getMessage() { return message; }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
