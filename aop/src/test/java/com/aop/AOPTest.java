package com.aop;

import com.aop.target.CalculatorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class AOPTest {

    @Autowired
    private CalculatorService calculatorService;

    @Test
    public void testSum(){
        calculatorService.sum(2,3);
    }

    @Test
    public void testMultiply(){
        calculatorService.multiply(2,3);
    }
}
