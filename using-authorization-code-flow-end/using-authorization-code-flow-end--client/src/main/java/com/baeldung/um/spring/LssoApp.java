package com.baeldung.um.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@ComponentScan("com.baeldung.um")
public class LssoApp {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(new Class[] { LssoApp.class, UmMvcConfig.class }, args);
    }

}
