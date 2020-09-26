package com.carrot.train.service.Imp;


import com.carrot.train.mapper.UsersMapper;
import com.carrot.train.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImp implements UserService {
    @Autowired
    private UsersMapper usersMapper;


}
