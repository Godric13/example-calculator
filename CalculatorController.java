package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String hellow() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam(name = "num1", required = false) Integer num1,
                       @RequestParam(name ="num2",required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "ERROR";
        }

        return num1 + "+" + num2 + "=" + calculatorService.plus(num1, num2) ;
    }

    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam(name = "num1", required = false) Integer num1,
                       @RequestParam(name ="num2",required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "ERROR";
        }

        return num1 + "-" + num2 + "=" + calculatorService.minus(num1, num2) ;
    }

    @GetMapping(path = "/calculator/multyply")
    public String multyply(@RequestParam(name = "num1", required = false) Integer num1,
                       @RequestParam(name ="num2",required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "ERROR";
        }

        return num1 + "*" + num2 + "=" + calculatorService.multyply(num1, num2) ;
    }

    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam(name = "num1", required = false) Integer num1,
                       @RequestParam(name ="num2",required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "ERROR";
        }

        return num1 + "/" + num2 + "=" + calculatorService.divide(num1, num2) ;
    }



}
