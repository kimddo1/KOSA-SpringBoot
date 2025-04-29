package com.kosa.restapi.controller;

import com.kosa.restapi.domain.Post;
import com.kosa.restapi.domain.User;
import com.kosa.restapi.exception.UserNotFoundException;
//import com.kosa.restapi.repository.PostRepository;
//import com.kosa.restapi.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jpa")
public class UserJpaController {
//    private UserRepository userRepository;
//    private PostRepository postRepository;
//
//    public UserJpaController(UserRepository userRepository, PostRepository postRepository) {
//        this.userRepository = userRepository;
//        this.postRepository = postRepository;
//    }
//
//    @GetMapping("/users")
//    public List<User> retrieveAllUsers() {
//        return userRepository.findAll();
//    }
//
//    @GetMapping("/users/{id}")
//    public EntityModel<User> retrieveUser(@PathVariable int id) {
//        Optional<User> user = userRepository.findById(id);
//
//        if(!user.isPresent()) {
//            throw new UserNotFoundException("id-"+id);
//        }
//        EntityModel<User> model = EntityModel.of(user.get());
//        WebMvcLinkBuilder linkTo = WebMvcLinkBuilder
//                .linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).retrieveAllUsers());
//
//        model.add(linkTo.withRel("all-users"));
//        return model;
//    }
//
//    @DeleteMapping("/users/{id}")
//    public void deleteUser(@PathVariable int id) {
//        userRepository.deleteById(id);
//    }
//
//    @PostMapping("/users")
//    public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
//        User savedUser = userRepository.save(user);
//        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
//                .path("/{id}")
//                .buildAndExpand(savedUser.getId())
//                .toUri();
//
//        return ResponseEntity.created(location).build();
//    }
//
//    @GetMapping("/users/{id}/posts")
//    public List<Post> retrieveAllPostsByUser(@PathVariable int id) {
//        Optional<User> user = userRepository.findById(id);
//        if(!user.isPresent()) {
//            throw new UserNotFoundException("id-"+id);
//        }
//        return user.get().getPosts();
//    }
//
//    @PostMapping("/users/{id}/posts")
//    public ResponseEntity createPost(@RequestBody Post post, @PathVariable int id) {
//        Optional<User> userOptional = userRepository.findById(id);
//        if(!userOptional.isPresent()) {
//            throw new UserNotFoundException("id-"+id);
//        }
//        User user = userOptional.get();
//        post.setUser(user);
//        postRepository.save(post);
//
//        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
//                .path("/{id}")
//                .buildAndExpand(post.getId())
//                .toUri();
//
//        return ResponseEntity.created(location).build();
//    }
//
//    @GetMapping("/users/{id}/posts/{post_id}")
//    public Post retrievePost(@PathVariable int id, @PathVariable int post_id) {
//        Optional<User> userOptional = userRepository.findById(id);
//        if(!userOptional.isPresent()) {
//            throw new UserNotFoundException("id-"+id);
//        }
//        User user = userOptional.get();
//        List<Post> posts = user.getPosts();
//        Post post = null;
//
//        for(int i=0; i<posts.size(); i++) {
//            post = posts.get(i);
//            if(post.getId() == post_id) {
//                return post;
//            }
//        }
//        return null;
//    }
}