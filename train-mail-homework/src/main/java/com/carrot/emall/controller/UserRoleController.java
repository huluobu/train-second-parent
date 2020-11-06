package com.carrot.emall.controller;


import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.carrot.emall.common.CommonResult;
import com.carrot.emall.entity.UserRole;
import com.carrot.emall.entity.UserRole;
import com.carrot.emall.service.imp.UserRoleServiceImpl;
import com.carrot.emall.service.imp.UserRoleServiceImpl;
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
@RequestMapping("/manager/user-role")
@Slf4j
public class UserRoleController {
    @Autowired
    private UserRoleServiceImpl userRoleService;

    @RequestMapping("/add")
    public CommonResult addUserRole(@RequestBody JSONObject jsonObject) {
        CommonResult result = new CommonResult();
        UserRole param = JSONUtil.toBean(jsonObject, UserRole.class);
        log.info("插入的id数据为 ："+param);
        userRoleService.save(param);
        log.info("插入的id数据成功");
        result.setCode("00000");
        result.setMessage("success");
        result.setData(param);
        return  result;
    }

    @RequestMapping("/update")
    public CommonResult updateMid(@RequestBody JSONObject jsonObject) {
        CommonResult result = new CommonResult();
        UserRole param = JSONUtil.toBean(jsonObject, UserRole.class);
        log.info("更新id数据为 ："+param);
        userRoleService.updateById(param);
        log.info("更新id"+param.getRoleId()+"成功");
        result.setCode("00000");
        result.setMessage("success");
        result.setData(param);
        return  result;
    }

    @RequestMapping("/query")
    public CommonResult queryUserById(@RequestBody JSONObject jsonObject) {
        CommonResult result = new CommonResult();
        UserRole param = JSONUtil.toBean(jsonObject, UserRole.class);
        UserRole userMid = userRoleService.getById(param.getRoleId());
        result.setCode("00000");
        result.setMessage("success");
        result.setData(userMid);
        return  result;
    }

    @RequestMapping("/delete")
    public CommonResult deleteUserById(@RequestBody JSONObject jsonObject) {
        CommonResult result = new CommonResult();
        UserRole param = JSONUtil.toBean(jsonObject, UserRole.class);
        param.setRoleStatus("N");
        userRoleService.updateById(param);
        result.setCode("00000");
        result.setMessage("success");
        result.setData(param);
        return  result;
    }

}
