package com.vainglory.service.serviceImpl;

import com.vainglory.domain.User;
import com.vainglory.mapper.UserMapper;
import com.vainglory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        return userMapper.findAll();
    }
}
