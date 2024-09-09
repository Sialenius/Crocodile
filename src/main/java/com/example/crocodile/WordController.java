// src/main/java/com/example/demo/WordController.java
package com.example.crocodile;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.util.ArrayList;

@RestController
public class WordController {
    private static String greetings = "Привет, Крокодил! 🐊\n";
    private static String[] words = {"Баскетбол", "Каяк", "Мотоцикл", "Кросфит"};
    private String previousWord = null;

  /*  WordController() {
        BufferedReader reader = new BufferedReader(new FileReader("~/IdeaProjects/Crocodile/scr/main/resources/words.txt"));
        String str;

        ArrayList<String> list = new ArrayList<String>();
        while((str = reader.readLine()) != null ){
            if(!str.isEmpty()){
                list.add(str);
                System.out.println(str);
            }}
        words = list.toArray(new String[0]);
    }


   */


    @GetMapping("/word")
    public String getWord() {

        Random random = new Random();
        int index = random.nextInt(words.length);
        while (previousWord == words[index]) {
            index = random.nextInt(words.length);
        }
        previousWord = words[index];



        //return words[index];

        String message = greetings + System.lineSeparator() + words[index];
        return message;
    }



}