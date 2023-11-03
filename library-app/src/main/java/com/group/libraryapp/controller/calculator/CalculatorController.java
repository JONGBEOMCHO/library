package com.group.libraryapp.controller.calculator;

import com.group.libraryapp.dto.calculator.request.CalculatorAddRequest;
import com.group.libraryapp.dto.calculator.request.CalculatorMultiplayRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

/*    @GetMapping("/add") //Get add
    public int addTwoNumbers(@RequestParam int num1, @RequestParam int num2){
        return num1 + num2;
    }*/

    @GetMapping("/add")
    public int addTwoNumbers(CalculatorAddRequest request){
        return request.getNum1() + request.getNum2();
    }

    @PostMapping("/multiply")
    public int multiTwoNumbers(@RequestBody CalculatorMultiplayRequest request){
        return request.getNum2() * request.getNum1();
    }


}