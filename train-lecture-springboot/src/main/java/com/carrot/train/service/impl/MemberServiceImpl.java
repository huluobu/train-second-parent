package com.carrot.train.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.carrot.train.mapper.MemberMapper;
import com.carrot.train.model.Member;
import com.carrot.train.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Lance
 * @create: 2020-09-19
 **/
@Service
public class MemberServiceImpl extends BaseServiceImpl<Member> implements MemberService {
    @Autowired
    private MemberMapper memberMapper;

    @Override
    public BaseMapper<Member> getMapper() {
        return memberMapper;
    }
}
