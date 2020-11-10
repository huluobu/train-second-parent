package com.carrot.train.controller;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.carrot.train.entity.CommonResult;
import com.carrot.train.entity.JwtUtil;
import com.carrot.train.entity.User;
import com.carrot.train.service.Imp.UserServiceImp;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: carrot
 * @Date: 2020/11/10 08:56
 * @Description:
 */
@RequestMapping("user")
@RestController
public class LoginJwtController {
    @Autowired
    private UserServiceImp userServiceImp;

    @GetMapping("/login")
    public CommonResult userlogin(@RequestBody JSONObject jsonObject) {
        CommonResult result = new CommonResult();
        User param = JSONUtil.toBean(jsonObject, User.class);
        User resultuser=userServiceImp.findByUserName(param.getUsername());
        if (resultuser.getPassword().equals(param.getPassword())) {
            String tocken = JwtUtil.generalTocken(resultuser);
            JSONObject jsonObject1 = new JSONObject();
            jsonObject1.set("user", resultuser);
            jsonObject1.set("tocken", tocken);
            result.setMessage("success");
            result.setData(jsonObject1);
        } else {
            result.setMessage("fail");
            result.setData("密码错误，请重新输入");
        }
        return result;
    }

    @RequestMapping("/whoami")
    public String getMessage(@RequestBody JSONObject jsonObject) {
        try {
            String tocken=jsonObject.getStr("tocken");
            Claims claims = JwtUtil.parseTocken(tocken);
            String username = claims.get("username", String.class);
            System.out.println("执行处理器中的控制器中的对应方法中的方法体。");
            return username + "，你已通过验证";
        } catch (Exception e) {
            e.printStackTrace();
            return "处理tocken出现错误。";
        }
    }
}
