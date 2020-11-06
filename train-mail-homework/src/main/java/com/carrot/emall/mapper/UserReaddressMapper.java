package com.carrot.emall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.carrot.emall.entity.UserReaddress;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author carrot
 * @since 2020-11-05
 */
@Mapper
public interface UserReaddressMapper extends BaseMapper<UserReaddress> {

    List<UserReaddress> selectByUserId(Integer userid);

}
