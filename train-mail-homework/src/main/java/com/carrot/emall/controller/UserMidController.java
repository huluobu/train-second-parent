package com.carrot.emall.controller;


import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.carrot.emall.common.CommonResult;
import com.carrot.emall.entity.UserMid;
import com.carrot.emall.service.imp.UserMidServiceImpl;
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
@RequestMapping("/manager/user-mid")
@Slf4j
public class UserMidController {

    @Autowired
    private UserMidServiceImpl userMidService;

    @RequestMapping("/add")
    public CommonResult addUserMid(@RequestBody JSONObject jsonObject) {
        CommonResult result = new CommonResult();
        UserMid param = JSONUtil.toBean(jsonObject, UserMid.class);
        log.info("插入的usermid数据为 ："+param);
        userMidService.save(param);
        log.info("插入的usermid数据成功");
        result.setCode("00000");
        result.setMessage("success");
        result.setData(param);
        return  result;
    }

    @RequestMapping("/update")
    public CommonResult updateMid(@RequestBody JSONObject jsonObject) {
        CommonResult result = new CommonResult();
        UserMid param = JSONUtil.toBean(jsonObject, UserMid.class);
        log.info("更新usermid数据为 ："+param);
        userMidService.updateById(param);
        log.info("更新userid"+param.getUserId()+"成功");
        result.setCode("00000");
        result.setMessage("success");
        result.setData(param);
        return  result;
    }

    @RequestMapping("/query")
    public CommonResult queryUserById(@RequestBody JSONObject jsonObject) {
        CommonResult result = new CommonResult();
        UserMid param = JSONUtil.toBean(jsonObject, UserMid.class);
        UserMid userMid = userMidService.getById(param.getUserId());
        result.setCode("00000");
        result.setMessage("success");
        result.setData(userMid);
        return  result;
    }

    @RequestMapping("/delete")
    public CommonResult deleteUserById(@RequestBody JSONObject jsonObject) {
        CommonResult result = new CommonResult();
        UserMid param = JSONUtil.toBean(jsonObject, UserMid.class);
        param.setUserStatus("N");
        userMidService.updateById(param);
        result.setCode("00000");
        result.setMessage("success");
        result.setData(param);
        return  result;
    }
}
