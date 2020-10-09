package com.carrot.train.controller;

import com.carrot.train.entity.Film;
import com.carrot.train.service.Imp.FilmServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Author: carrot
 * @Date: 2020/10/9 14:13
 * @Description:
 */
@RequestMapping("pages")
@Controller
public class CommonDispatcherController {
    @Autowired
    private FilmServiceImp filmServiceImp;

    @RequestMapping("/home")
    public String toHomepage(HttpServletRequest request, HttpServletResponse response) {
        List<Film> list = filmServiceImp.queryAllFilm();
        request.setAttribute("film",list);
        return "home";
    }
}
