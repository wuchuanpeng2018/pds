package com.from.pu.config;

import com.from.pu.springboot.RandomPropertySourceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Description: $
 * @Author: wuchp
 * @Date: $ $
 * @Modifide by
 */
public class InitializerConfig implements ApplicationContextInitializer<ConfigurableApplicationContext> {

//    @Autowired
//    RandomPropertySourceTest randomPropertySourceTest;

    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        //System.err.println("-=======================InitializerConfig = ")
                //+ randomPropertySourceTest.getIntNumber())
        //;
    }
}
