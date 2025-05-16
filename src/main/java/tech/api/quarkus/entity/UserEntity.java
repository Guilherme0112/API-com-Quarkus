package tech.api.quarkus.entity;

import jakarta.persistence.*;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.validation.constraints.*;
import tech.api.quarkus.enums.RoleUser;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Entity
@Table(name = "tb_users")
public class UserEntity extends PanacheEntity{

    @NotNull(message = "O nome é obrigatório")
    @Size(min = 2, max = 55, message = "O nome deve ter entre 2 e 55 caracteres")
    private String name;

    @Email(message = "O email deve ser válido")
    @NotBlank(message = "O email é obrigatório")
    private String email;

    @NotNull(message = "A senha é obrigatória")
    @Size(min = 8, max = 14, message = "A senha deve ter entre 8 e 14 caracteres")
    private String password;

    private boolean isActive = false;

    private RoleUser role;

    @Column(nullable = false, updatable = false)
    private LocalDateTime created_in = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreated_in() {
        return created_in;
    }

    public void setCreated_in(LocalDateTime created_in) {
        this.created_in = created_in;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public RoleUser getRole() {
        return role;
    }

    public void setRole(RoleUser role) {
        this.role = role;
    }
}
