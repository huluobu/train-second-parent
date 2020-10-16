package com.carrot.train.controller;

import com.carrot.train.entity.MatchUnionFilm;
import com.carrot.train.service.Imp.FilmMatchServiceImp;
import com.carrot.train.service.Imp.FilmServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Autowired
    private FilmMatchServiceImp filmMatchServiceImp;

    @RequestMapping("/home")
    public String toHomepage(HttpServletRequest request, HttpServletResponse response) {
        Map<String, String> params=new HashMap<>();
        List<MatchUnionFilm> list = filmMatchServiceImp.queryByParams(params);
        request.setAttribute("film",list);
        return "home";
    }
}
