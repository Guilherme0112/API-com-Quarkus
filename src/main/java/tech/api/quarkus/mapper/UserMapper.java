package tech.api.quarkus.mapper;

import org.mapstruct.Mapper;
import tech.api.quarkus.entity.UserEntity;
import tech.api.quarkus.request.UserRequest;
import tech.api.quarkus.response.UserResponse;

@Mapper(componentModel = "cdi")
public interface UserMapper {
    UserResponse toResponse(UserEntity entity);
    UserEntity toEntity(UserRequest request);
}
