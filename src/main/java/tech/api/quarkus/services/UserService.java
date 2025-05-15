package tech.api.quarkus.services;

import jakarta.enterprise.context.ApplicationScoped;
import tech.api.quarkus.entity.UserEntity;
import tech.api.quarkus.response.UserResponse;

@ApplicationScoped
public class UserService {

    public UserResponse save(UserResponse user){

        return new UserResponse();
    }
}
