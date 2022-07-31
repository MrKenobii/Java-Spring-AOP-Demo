package com.anilduyguc.aopdemo.pointcut.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspect {

    @Pointcut("execution(* com.anilduyguc.aopdemo.pointcut.dao.*.*(..))")
    private void forDaoPackage(){}

    @Pointcut("execution(* com.anilduyguc.aopdemo.pointcut.dao.*.get*(..))")
    private void getter(){}

    @Pointcut("execution(* com.anilduyguc.aopdemo.pointcut.dao.*.set*(..))")
    private void setter(){}

    @Pointcut("forDaoPackage() && !(getter() || setter())")
    private void forDaoPackageNoGetterSetter(){}

    @Before("forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice(){
        System.out.println("\n======>>> Executing @Before advice on add*()"); // this will run before the addAccount method
    }
    @Before("forDaoPackageNoGetterSetter()")
    public void performApiAnalytics() {
        System.out.println("\n======>>> Performing API analytics :P");
    }
}
