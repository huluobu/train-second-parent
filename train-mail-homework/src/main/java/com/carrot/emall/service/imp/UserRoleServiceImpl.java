package com.carrot.emall.service.imp;

import com.carrot.emall.entity.UserRole;
import com.carrot.emall.mapper.UserRoleMapper;
import com.carrot.emall.service.UserRoleService;
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
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {
    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public UserRole findUserRoleById(Object id) {
        return userRoleMapper.findUserRoleById(id);
    }
}
