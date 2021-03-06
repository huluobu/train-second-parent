package com.carrot.emall.service;

import com.carrot.emall.entity.UserMid;
import com.baomidou.mybatisplus.extension.service.IService;
import com.carrot.emall.pojo.UserUion;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author carrot
 * @since 2020-11-05
 */
public interface UserMidService extends IService<UserMid> {
    UserUion findByUserId(Integer userid);
}
