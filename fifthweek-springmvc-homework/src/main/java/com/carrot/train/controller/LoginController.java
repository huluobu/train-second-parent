package com.carrot.train.controller;

import com.carrot.train.entity.User;
import com.carrot.train.service.Imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author: carrot
 * @Date: 2020/9/28 11:06
 * @Description:
 */
@Controller
public class LoginController {

    @Autowired
    private  UserServiceImp userServiceImp;

    @PostMapping("/submitLogin")
    public Object submitLogin(String username, String password, Model model,
                              HttpServletRequest request, HttpServletResponse servletResponse) {
        System.out.println(servletResponse.getCharacterEncoding());
        servletResponse.setCharacterEncoding("UTF-8");
        System.out.println(servletResponse.getCharacterEncoding());
        servletResponse.setContentType("text/html; charset=UTF-8");
        System.out.println(servletResponse.getContentType());
        String msg = null;
        User user = null;
        if (null == username || null == password) {
            msg = "参数错误";
        } else {
            user = userServiceImp.findByUserName(username);
            if (null == user) {
                msg = "用户不存在";
            } else if (!password.equals(user.getPassword())) {
                msg = "用户密码错误";
            }
        }

        if (null != msg) {
//            model.addAttribute("msg", msg);
            request.setAttribute("msg", msg);
            request.setAttribute("username",username);
            request.setAttribute("password",password);

            return "/user/login";
        }
        System.out.println(user.toString());

        model.addAttribute("user", user);
//        HttpSession session=request.getSession();
//        session.setAttribute("username", username);
        request.getSession().setAttribute("username", username);
        return "/user/login_success.html";

    }

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        request.getSession().invalidate();

        return "/home";
    }

}
