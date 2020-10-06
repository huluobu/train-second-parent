package com.carrot.train.controller;

import com.carrot.train.entity.Film;
import com.carrot.train.entity.FilmMatch;
import com.carrot.train.service.Imp.FilmMatchServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: carrot
 * @Date: 2020/10/6 11:19
 */
@Controller
public class FilmMatchManageController {
    @Autowired
    private FilmMatchServiceImp filmMatchServiceImp;

    private String seats = "1,2,3,4,5,6,7,8,9,10,11,12";


    public void insertMovieMatch() {
        FilmMatch filmMatch = new FilmMatch(null,1,"CBD店","3D",new BigDecimal(65),0,new Date(),seats,"Y");
        filmMatchServiceImp.insert(filmMatch);

    }


    public  void  updateMovieMatch() {
        FilmMatch filmMatch = (FilmMatch) filmMatchServiceImp.findByPrimaryKey(1);
        filmMatch.setFilmprice(new BigDecimal(70));
        filmMatchServiceImp.update(filmMatch);

    }
}
