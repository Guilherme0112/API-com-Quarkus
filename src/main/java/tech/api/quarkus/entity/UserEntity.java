package tech.api.quarkus.entity;

import jakarta.persistence.*;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Entity
@Table(name = "tb_users")
public class UserEntity extends PanacheEntity{


    private String name;

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
}
