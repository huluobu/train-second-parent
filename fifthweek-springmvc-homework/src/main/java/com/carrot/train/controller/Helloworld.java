package com.carrot.train.controller;

import com.carrot.train.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class Helloworld {
    private String hello = "hello world";

    @RequestMapping("/hello")
    public String helloworld() {
        System.out.println(hello);
        return "/user/login";
    }

    @RequestMapping(value = "/hello2")
    public String testHelloWorld(@RequestParam(value = "username") String un,
                                 @RequestParam(value = "age") int age) {
        System.out.println("testhello username: "+un+", age: "+age);
        return "/user/login_success";
    }


    @RequestMapping(value = "hello4")
    public String testCookie(@CookieValue("JSESSIONID") String al) {
        System.out.println("CookieValue: "+al);
        return "/user/login";
    }

    @RequestMapping("/hello5")
    public String testmodelview(@ModelAttribute("adb") User user) {
        System.out.println("修改: " + user);
        return "user/login";
    }

    @ModelAttribute
    public void getUser(@RequestParam(value="id",required=false) Integer id,
                        Map<String, Object> map){
        System.out.println("modelAttribute method");
        if(id != null){
            //模拟从数据库中获取对象
            User user = new User(1, "Tom", "123456", "tom@atguigu.com","Y");
            System.out.println("从数据库中获取一个对象: " + user);

            map.put("adb", user);
        }
    }

    @RequestMapping("/hello6")
    public String testView(){
        System.out.println("testView");
        return "helloView";
    }

}
