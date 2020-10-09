package com.carrot.train.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author: carrot
 * @Date: 2020/10/9 08:50
 * @Description:
 */
@Controller
public class FilmCartController {

    @RequestMapping("cart/list")
    public String toCart(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession(true);
        System.out.println(session);

        return "cart/cart";
    }
}
