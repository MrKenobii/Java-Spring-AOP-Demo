package com.anilduyguc.aopdemo.pointcut.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class DemoLoggingAspect {

    @Before("com.anilduyguc.aopdemo.pointcut.expressions.PointcutDeclarations.forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice(){
        System.out.println("\n======>>> Executing @Before advice on add*()"); // this will run before the addAccount method
    }

}
