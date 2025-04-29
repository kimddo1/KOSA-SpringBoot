package com.kosa.restapi.mapper;

import com.kosa.restapi.domain.Post;
import com.kosa.restapi.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<User> findAllUsers();

    public User findUser(int id);

    public void createUser(User user);

    public void createPost(Post post);

    public int deleteUser(int id);
}
