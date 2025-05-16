package tech.api.quarkus.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import tech.api.quarkus.entity.UserEntity;
import tech.api.quarkus.enums.RoleUser;
import tech.api.quarkus.mapper.UserMapper;
import tech.api.quarkus.response.UserResponse;

@ApplicationScoped
public class UserService {

    @Inject
    UserMapper userMapper;

    public UserResponse save(UserEntity userEntity){
        userEntity.setRole(RoleUser.USER);
        UserEntity.persist(userEntity);
        return userMapper.toResponse(userEntity);
    }
}
