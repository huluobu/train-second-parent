package com.carrot.train.controller;

import com.carrot.train.entity.FilmOrder;
import com.carrot.train.service.Imp.FilmMatchServiceImp;
import com.carrot.train.service.Imp.FilmOrderImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: carrot
 * @Date: 2020/10/6 12:55
 */
@Controller
public class FilmOrderController {
    @Autowired
    private FilmOrderImp filmOrderImp;


    private void insertMovieOrder() {
        FilmOrder filmOrder = new FilmOrder(null, 1, "1", new Date(),new Date(),"1",null,null,"Y");
        filmOrderImp.insert(filmOrder);
    }

    @RequestMapping("/hello8")
    private  void  updateMovieOrder() {
        FilmOrder filmOrder = (FilmOrder) filmOrderImp.findByPrimaryKey(1);
        filmOrder.setPrice(new BigDecimal("72"));
        filmOrderImp.update(filmOrder);
    }
}
