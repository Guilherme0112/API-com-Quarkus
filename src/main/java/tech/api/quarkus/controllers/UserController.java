package tech.api.quarkus.controllers;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import tech.api.quarkus.entity.UserEntity;
import tech.api.quarkus.mapper.UserMapper;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserController {

    @Inject
    UserMapper userMapper;

    @GET
    public Response getUsers(){
        return Response.ok("test").build();
    }

    @POST
    public Response createUser(UserEntity userEntity){

        return Response.ok(userMapper.toResponse(userEntity)).build();
    }

}
