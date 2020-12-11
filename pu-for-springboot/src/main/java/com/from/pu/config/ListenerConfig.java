package com.from.pu.config;

import com.from.pu.springboot.RandomPropertySourceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @Description: $
 * @Author: wuchp
 * @Date: $ $
 * @Modifide by
 */
public class ListenerConfig implements ApplicationListener<ApplicationEvent> {

//    @Autowired
//    RandomPropertySourceTest randomPropertySourceTest;

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        //System.err.println("-=======================ListenerConfig = ")
                //+randomPropertySourceTest.getIntNumber())
        //;
    }
}
