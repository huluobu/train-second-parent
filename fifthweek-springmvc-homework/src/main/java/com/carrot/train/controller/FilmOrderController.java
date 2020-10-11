package com.carrot.train.controller;

import com.carrot.train.entity.FilmOrder;
import com.carrot.train.service.Imp.FilmMatchServiceImp;
import com.carrot.train.service.Imp.FilmOrderImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: carrot
 * @Date: 2020/10/6 12:55
 */
@RequestMapping("order")
@Controller
public class FilmOrderController {
    @Autowired
    private FilmOrderImp filmOrderImp;


    @RequestMapping("/add")
    private void insertMovieOrder(HttpServletRequest request, HttpServletResponse response, Integer matchid) {
        FilmOrder filmOrder = new FilmOrder(null, 1, "1", new Date(),new Date(),"1",null,null,"Y");
        filmOrderImp.insert(filmOrder);
    }


    private  void  updateMovieOrder() {
        FilmOrder filmOrder = (FilmOrder) filmOrderImp.findByPrimaryKey(1);
        filmOrder.setPrice(new BigDecimal("72"));
        filmOrderImp.update(filmOrder);
    }
}
