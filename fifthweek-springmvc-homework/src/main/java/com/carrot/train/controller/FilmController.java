package com.carrot.train.controller;

import com.carrot.train.entity.Film;
import com.carrot.train.service.Imp.FilmServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;

/**
 * @Author: carrot
 * @Date: 2020/10/6 9:52
 */
@Controller
public class FilmController {
    @Autowired
    private FilmServiceImp filmServiceImp;

    public void insertMovie() {
        Film film = new Film();
        film.setStatus("Y");
        film.setFilmname("叶问");
        film.setFilmtype("动作");
        film.setFilmprice(new BigDecimal(50));
        film.setFilminfo("甄子丹");
        film.setSales(0);
        filmServiceImp.insert(film);

    }

//    @RequestMapping("/hello8")
    public void updateMovie() {
        Film film = (Film) filmServiceImp.findByPrimaryKey(1);
        film.setFilmtype("动作");
//        film.setStatus("Y");
//        film.setFilmname("叶问");
//        film.setFilmtype("动作");
//        film.setFilmprice(new BigDecimal(50));
//        film.setFilminfo("甄子丹");
//        film.setSales(0);
        filmServiceImp.update(film);

    }
}
