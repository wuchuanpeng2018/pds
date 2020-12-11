package com.from.pu.controller;

import com.from.pu.springboot.RandomPropertySourceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: $
 * @Author: wuchp
 * @Date: $ $
 * @Modifide by
 */
@RestController
public class HelloWorld {

    @Autowired
    RandomPropertySourceTest test;


    @RequestMapping("/test")
    public String test(){
        return test.getUuid();
    }

}
