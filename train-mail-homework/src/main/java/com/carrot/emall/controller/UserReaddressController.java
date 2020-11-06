package com.carrot.emall.controller;


import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.carrot.emall.common.CommonResult;
import com.carrot.emall.entity.UserReaddress;
import com.carrot.emall.entity.UserReaddress;
import com.carrot.emall.service.imp.UserReaddressServiceImpl;
import com.carrot.emall.service.imp.UserReaddressServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author carrot
 * @since 2020-11-05
 */
@RestController
@RequestMapping("/manager/user-readdress")
@Slf4j
public class UserReaddressController {
    @Autowired
    private UserReaddressServiceImpl userReaddressService;

    @RequestMapping("/add")
    public CommonResult addUserReaddress(@RequestBody JSONObject jsonObject) {
        CommonResult result = new CommonResult();
        UserReaddress param = JSONUtil.toBean(jsonObject, UserReaddress.class);
        log.info("插入的id数据为 ："+param.toString());
        userReaddressService.save(param);
        log.info("插入的id数据成功");
        result.setCode("00000");
        result.setMessage("success");
        result.setData(param);
        return  result;
    }

    @RequestMapping("/update")
    public CommonResult updateMid(@RequestBody JSONObject jsonObject) {
        CommonResult result = new CommonResult();
        UserReaddress param = JSONUtil.toBean(jsonObject, UserReaddress.class);
        log.info("更新id数据为 ："+param);
        userReaddressService.updateById(param);
        log.info("更新id"+param.getAddrId()+"成功");
        result.setCode("00000");
        result.setMessage("success");
        result.setData(param);
        return  result;
    }

    @RequestMapping("/query")
    public CommonResult queryUserById(@RequestBody JSONObject jsonObject) {
        CommonResult result = new CommonResult();
        UserReaddress param = JSONUtil.toBean(jsonObject, UserReaddress.class);
        UserReaddress userMid = userReaddressService.getById(param.getAddrId());
        result.setCode("00000");
        result.setMessage("success");
        result.setData(userMid);
        return  result;
    }

    @RequestMapping("/delete")
    public CommonResult deleteUserById(@RequestBody JSONObject jsonObject) {
        CommonResult result = new CommonResult();
        UserReaddress param = JSONUtil.toBean(jsonObject, UserReaddress.class);
        param.setAddrStatus("N");
        userReaddressService.updateById(param);
        result.setCode("00000");
        result.setMessage("success");
        result.setData(param);
        return  result;
    }

}
