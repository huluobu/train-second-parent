package com.carrot.emall.service.impl;

import com.carrot.emall.entity.UserInfo;
import com.carrot.emall.mapper.UserInfoMapper;
import com.carrot.emall.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
