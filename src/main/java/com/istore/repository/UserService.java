package com.istore.repository;

import com.istore.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    private Map<Long, User> userMap = new HashMap<>();

    public User getUserById(Long userId) {
        return userMap.get(userId);
    }

    public User addUser(User user) {
        return userMap.put(user.getId(), user);
    }

    public List<User> getAllUsers(){
        return new ArrayList<>(userMap.values());
    }

    public User deleteUserById(Long userId){
        return userMap.remove(userId);
    }
}
