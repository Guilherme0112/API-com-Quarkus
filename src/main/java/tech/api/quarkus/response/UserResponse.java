package tech.api.quarkus.response;

import java.time.LocalDateTime;
import java.util.UUID;

public class UserResponse {

    private UUID id;
    private String name;
    private String email;
    private LocalDateTime created_in;

    public UserResponse(){}

    public UserResponse(UUID id, String name, String email, LocalDateTime created_in){
        this.id = id;
        this.name = name;
        this.email = email;
        this.created_in = created_in;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getCreated_in() {
        return created_in;
    }

    public void setCreated_in(LocalDateTime created_in) {
        this.created_in = created_in;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
