package com.kosa.restapi.service;

import com.kosa.restapi.domain.Post;
import com.kosa.restapi.domain.User;
import com.kosa.restapi.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserMapper mapper;

    public UserService(UserMapper mapper) {
        this.mapper = mapper;
    }

    public List<User> findAll() {
        return mapper.findAllUsers();
    }

    public User findOne(int id) {
        return mapper.findUser(id);
    }

    public User save(User user) {
        mapper.createUser(user);
        return user;
    }

    public void savePost(Post post) {
        mapper.createPost(post);
    }

    public User deleteById(int id) {
        User user = mapper.findUser(id);

        if(user == null) {
            return null;
        }
        mapper.deleteUser(id);
        return user;
    }
}
