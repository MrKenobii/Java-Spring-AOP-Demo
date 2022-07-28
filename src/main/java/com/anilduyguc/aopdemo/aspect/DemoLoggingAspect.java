package com.anilduyguc.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspect {

    //@Before("execution(public void addAccount())") // will match any classes addAccount method
    //@Before("execution(public void com.anilduyguc.aopdemo.dao.AccountDAO.addAccount())") // only match addAccount method with specific class
    //@Before("execution(public void add*())") // Match method starting with "add" in any class
    @Before("execution(* add*())") // Match method starting with "add" with any return type in any class
    public void beforeAddAccountAdvice(){
        System.out.println("\n======>>> Executing @Before advice on add*()"); // this will run before the addAccount method
    }
}
