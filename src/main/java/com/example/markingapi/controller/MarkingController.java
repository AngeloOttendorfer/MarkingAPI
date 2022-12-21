package com.example.markingapi.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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

    @GetMapping("api/mark")
    @ResponseBody
    public int getGrade(@RequestParam int percentage){
        int grade = 0;
        if(percentage < 50){
            grade = 5;
        }
        else if((percentage >= 50) && (percentage < 63)){
            grade = 4;
        }
        else if((percentage >= 63) && (percentage < 75)){
            grade = 3;
        }
        else if((percentage <= 75) && (percentage < 88)){
            grade = 2;
        }
        else{
            grade = 1;
        }
        return grade;
    }
}
