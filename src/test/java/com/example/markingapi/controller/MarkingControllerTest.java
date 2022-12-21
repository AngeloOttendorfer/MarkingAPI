package com.example.markingapi.controller;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MarkingControllerTest {

    @Test
    void validInput() {
        MarkingController controller = new MarkingController();//Arrange
        ArrayList<Integer> expectedNumbers = new ArrayList<Integer>(100);

        for (int i = 1; i <= 100; i++)
        {
            expectedNumbers.add(i);
            System.out.println(expectedNumbers.get(i - 1));
        };//Arrange
        ArrayList<Integer> response = controller.validInput();//Act
        assertEquals(expectedNumbers, response);//Assert
    }

    @Test
    void getGrade() {
        MarkingController controller = new MarkingController();//Arrange
        Integer  response = controller.getGrade(0);//Act
        assertEquals(5, response);//Assert
    }
}