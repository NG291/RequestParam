package com.module4;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/testCalculator")
    public String showCalculator() {
        return "calculator";
    }

    @PostMapping("/testCalculator")
    public String Calculator(
            @RequestParam("num1") double num1, @RequestParam("num2") double num2, @RequestParam("operation") String operation, Model model) {
        double result = 0;
        String operationSymbol = "";
        switch (operation) {
            case "add":
                result = num1 + num2;
                operationSymbol = "+";
                break;
            case "multiply":
                result = num1 * num2;
                operationSymbol = "*";
                break;
            case "divide":
                if (num2 != 0) {
                    result = num1 / num2;
                    operationSymbol = "/";
                } else {
                    model.addAttribute("error", "Cannot divide by zero");
                    return "calculator";
                }
                break;
        }
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("operation", operationSymbol);
        model.addAttribute("result", result);

        return "calculator";
    }

}
