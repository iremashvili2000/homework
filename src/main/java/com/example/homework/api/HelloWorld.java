package com.example.homework.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/page/{pg}")
    public String sayHello(@PathVariable(name="pg")String pg){
        if(pg.equals("Home")){
            return pg;
        }else if(pg.equals("CONTACT")){
            return pg;
        }else if(pg.equals("ABOUT")){
            return pg;
        }else{
            return "error this page not found try again";
        }

    }


}
