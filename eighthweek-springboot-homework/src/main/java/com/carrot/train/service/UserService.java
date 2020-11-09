package com.carrot.train.service;


import com.carrot.train.entity.User;

import java.util.List;

public interface UserService extends BaseService{

    void saveList(List<User> list);

}
