package com.carrot.train.mapper;

import com.carrot.train.enetity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
 * @Author carrot
 * @Description 
 * @Date 2020/9/25 16:15
 **/

@Mapper
public interface UsersMapper extends BaseMapper {

    User findByUserName(Object primaryKey);
}
