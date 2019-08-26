package aop.target;

import org.springframework.stereotype.Component;

@Component
public class CalculatorService {

    public int sum(int x, int y){
        System.out.println("Doing sum");
        return x + y;
    }

    public int multiply(int x, int y){
        System.out.println("Doing multiplication");
        return x * y;
    }
}
