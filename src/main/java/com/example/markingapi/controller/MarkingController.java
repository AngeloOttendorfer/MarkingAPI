package com.example.markingapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MarkingController {
    @GetMapping("api/mark")
    public ArrayList<Integer> validInput(){
        ArrayList<Integer> numbers = new ArrayList<Integer>(100);

        for (int i = 1; i <= 100; i++)
        {
            numbers.add(i);
            System.out.println(numbers.get(i - 1));
        }
        return numbers;

    }
}
