package com.kosa.restapi.controller;

import com.kosa.restapi.domain.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World!!!";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        HelloWorldBean helloWorldBean = new HelloWorldBean("Hello");
        helloWorldBean.setMessage("World");
        System.out.println("출력: " + helloWorldBean.getMessage());
        return helloWorldBean;
    }

    @GetMapping("/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBeanPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}
