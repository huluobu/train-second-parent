package com.carrot.emall.service.imp;

import com.carrot.emall.entity.UserMid;
import com.carrot.emall.mapper.UserMidMapper;
import com.carrot.emall.mapper.UserRoleMapper;
import com.carrot.emall.pojo.UserUion;
import com.carrot.emall.service.UserMidService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author carrot
 * @since 2020-11-05
 */
@Service
public class UserMidServiceImpl extends ServiceImpl<UserMidMapper, UserMid> implements UserMidService {

    @Autowired
    private UserMidMapper userMidMapper;

    @Override
    public UserUion findByUserId(Integer userid) {
        return userMidMapper.findByUserId(userid);
    }
}
