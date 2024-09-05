// src/main/java/com/example/demo/WordController.java
package com.example.crocodile;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {

    //String[] words = {Кальян, };

    @GetMapping("/word")
    public String getWord() {
        //System.out.println("Привет, Крокодил!");
        return "Привет, Крокодил! 🐊";
    }
}