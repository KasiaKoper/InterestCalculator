package com.example.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class DepositController {


    @GetMapping("/")
    public String calculateDeposit(ModelMap modelMap) {
        modelMap.put("deposit", new Deposit());
        return "calculator";
    }
    //todo
    //html to be added

}
