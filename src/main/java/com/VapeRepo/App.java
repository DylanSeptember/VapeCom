package com.VapeRepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
//@RestController
@SpringBootApplication
//@EnableAutoConfiguration
public class App 
{
  /*  @RequestMapping("/")
    String home(){
        return "yo";
    }*/

    public static void main( String[] args ) throws Exception
    {
        SpringApplication.run(App.class, args);
    }
}
