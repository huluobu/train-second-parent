package com.carrot.emall.mapper;

import com.carrot.emall.entity.UserMid;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.carrot.emall.pojo.UserUion;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author carrot
 * @since 2020-11-05
 */
@Mapper
public interface UserMidMapper extends BaseMapper<UserMid> {

    UserUion findByUserId(Integer userid);



}
