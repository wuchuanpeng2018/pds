package com.from.pu.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: $
 * @Author: wuchp
 * @Date: $ $
 * @Modifide by
 */
@Configuration
public class CommandLineRunnerConfig implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.err.println("-=======================CommandLineRunnerConfig =");
    }
}
