package com.carrot.train.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.carrot.train.model.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper extends BaseMapper<Member> {
}
