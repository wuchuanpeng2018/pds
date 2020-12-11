package com.from.pu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.env.RandomValuePropertySource;

/**
 * @Description: $
 * @Author: wuchp
 * @Date: $ $
 * @Modifide by
 */
@SpringBootApplication
//@EnableConfigurationProperties(RandomPropertySourceTest.class)
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
        RandomValuePropertySource source = new RandomValuePropertySource("random.int[1,10]");
        System.out.println("source = " + source.getProperty("random.int[1,10]"));
    }

}
