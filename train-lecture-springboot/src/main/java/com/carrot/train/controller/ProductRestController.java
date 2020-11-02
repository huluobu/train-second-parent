package com.carrot.train.controller;

import com.carrot.train.model.Product;
import com.carrot.train.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @description: 产品列表页面
 * @author: Lance
 * @create: 2020-10-23
 **/
@Controller
@RequestMapping("/product")
public class ProductRestController {
    @Autowired
    private ProductService productService;

    /**
     * 查询所有产品
     *
     * @return
     */
    @GetMapping("/listProducts")
    public String listProducts(Model model) {
        List<Product> list = productService.select();
        model.addAttribute("list", list);

        return "/product/listProducts";
    }
}
