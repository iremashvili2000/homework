package com.example.homework.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


@RestController
public class SECOND {
    @GetMapping("/search/{name}/lastname/{gvari}")
    public String Secondhello(@PathVariable(name="name")String name,@PathVariable(name="gvari")String gvari){
        List<Person> list=new ArrayList<Person>();
        list.add(0,new Person("goga","iremashvili"));



        for(int i=0;i<list.size();i++){
            if(list.get(i).getName().equals(name) && list.get(i).getLastname().equals(gvari)){

                return name+" "+gvari;
            }
        }

        return "person don't found";

    }

}

