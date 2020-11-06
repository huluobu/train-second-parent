package com.carrot.emall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.carrot.emall.entity.UserRole;
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
public interface UserRoleMapper extends BaseMapper<UserRole> {
    UserRole findUserRoleById(Object id);
}
