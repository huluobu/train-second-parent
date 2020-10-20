package com.carrot.train.controller;

import com.carrot.train.entity.User;
import com.carrot.train.service.Imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: carrot
 * @Date: 2020/9/28 14:06
 * @Description:
 */

@Controller
public class RegisterController {
    @Autowired
    private UserServiceImp userServiceImp;


    @PostMapping("/submitRegister")
    public Object submitRegister(String username, String password, Model model,String email,
                                 HttpServletRequest request) throws Exception {
        if (null == username || null == password || null == email) {
            request.setAttribute("msg", "参数错误");
            request.setAttribute("username",username);
            request.setAttribute("password",password);
            return "pages/user/regist.html";
        }


        if (null != userServiceImp.findByUserName(username)) {
            request.setAttribute("msg", "用户名已被注册");
            request.setAttribute("username",username);
            request.setAttribute("password",password);
            request.setAttribute("email",email);
            return "pages/user/regist.html";
//            return "error";
        }


        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        user.setStatus("Y");
        userServiceImp.insert(user);
        return "pages/user/regist_success.html";
    }
}
