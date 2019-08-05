package com.wildcodeschool.myProjectWithSecurity.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Welcome to the Shield!!!";
    }
    
    @GetMapping("/avengers/assemble")
    public String avengers() {
        
        return "Avengers ... Assemble!!!";
    }

    @GetMapping("/secret-bases")
    public String[] listCities() {
        String[] cities = {
        "Biarritz",
        "Bordeaux",
        "La Loupe",
        "Lille",
        "Lyon",
        "Marseille",
        "Nantes",
        "Orléans",
        "Paris",
        "Reims",
        "Strasbourg",
        "Toulouse",
        "Tours"};

        return cities;        
    }
}

