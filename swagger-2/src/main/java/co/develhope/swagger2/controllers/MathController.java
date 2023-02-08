package co.develhope.swagger2.controllers;

import co.develhope.swagger2.entities.ArithmeticOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {
    @GetMapping("")
    public String welcomeMathMessage(){
        return "welcome in math page";
    }
    @GetMapping("/division-info")
    public ArithmeticOperation division(){
        ArithmeticOperation division = new ArithmeticOperation();
        division.setDescription("to divide a number for another number");
        division.setName("division");
        division.setProperties(new String[]{"Anti-commutativity", "Non-associativity"});
        return division;
    }
    @GetMapping("/multiplication")
    public Integer value(@RequestParam int x, @RequestParam int y){
        return x*y;
    }


    @GetMapping("/square/{n}")
    public Integer square(@PathVariable int n){
        return n * n;
    }

}
