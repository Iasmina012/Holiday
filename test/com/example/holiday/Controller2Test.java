package com.example.holiday;

import com.example.holiday.controller.Controller1;
import javafx.event.ActionEvent;
import org.junit.jupiter.api.Test;

class Controller2Test {

    @Test
    void initialize() {
        new Controller1().cancelButtonAction(new ActionEvent());
    }

    @Test
    void test(){
        /*SingleObject singleObject = SingleObject.getInstance();*/

    }
}