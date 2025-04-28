package com.kosa.restapi.controller;

import com.kosa.restapi.domain.User;
import com.kosa.restapi.exception.UserNotFoundException;
import com.kosa.restapi.service.UserDaoService;
import jakarta.validation.Valid;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserController {
    private UserDaoService service;

    public UserController(UserDaoService service) {
        this.service = service;
    }

    @GetMapping("/users")
    public List<User> retrieveAllUser() {
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public EntityModel<User> retrieveUser(@PathVariable int id) {
        User user = service.findOne(id);

        if (user==null){
            throw new UserNotFoundException(String.format("ID[%s] not found", id));
        }

        EntityModel<User> model = EntityModel.of(user);

        WebMvcLinkBuilder linkTo = WebMvcLinkBuilder
                .linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).retrieveAllUser());

        model.add(linkTo.withRel("all-users"));

        return model;
    }

    //HTTP Status 제어
    @PostMapping("/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
        User savedUser = service.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable int id) {
        User user = service.deleteById(id);
        if (user==null){
            throw new UserNotFoundException(String.format("ID[%s] not found", id));
        }
    }

}
