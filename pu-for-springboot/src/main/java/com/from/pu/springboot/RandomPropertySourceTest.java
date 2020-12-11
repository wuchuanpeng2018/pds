package com.from.pu.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Description: $
 * @Author: wuchp
 * @Date: $ $
 * @Modifide by
 */
@Configuration
@ConfigurationProperties(prefix = "user.random")
@PropertySource(value = { "config/random.properties" })
public class RandomPropertySourceTest {
    private String secret;
    private int intNumber;
    private int lessTen;
    private int range;
    private long longNumber;
    private String uuid;

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public int getIntNumber() {
        return intNumber;
    }

    public void setIntNumber(int intNumber) {
        this.intNumber = intNumber;
    }

    public int getLessTen() {
        return lessTen;
    }

    public void setLessTen(int lessTen) {
        this.lessTen = lessTen;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public long getLongNumber() {
        return longNumber;
    }

    public void setLongNumber(long longNumber) {
        this.longNumber = longNumber;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
