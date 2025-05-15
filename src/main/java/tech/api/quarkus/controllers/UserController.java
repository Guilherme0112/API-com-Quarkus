package tech.api.quarkus.controllers;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
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
    @Path("{id}")
    public Response getUsers(@PathParam("id") Long id){
        return Response.ok(userMapper.toResponse(UserEntity.findById(id))).build();
    }

    @POST
    @Transactional
    public Response createUser(@Valid UserEntity userEntity){
        UserEntity.persist(userEntity);
        return Response.ok(userMapper.toResponse(userEntity)).build();
    }

    @PUT
    @Transactional
    @Path("{id}")
    public Response updateUser(UserEntity userEntity, @PathParam("id") Long id){
        return Response.ok(userEntity).build();
    }

    @DELETE
    @Path("{id}")
    public Response deleteUser(@PathParam("id") Long id){
        return Response.ok(id).build();
    }

}
