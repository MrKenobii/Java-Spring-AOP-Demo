package com.anilduyguc.aopdemo.joinpoint.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class ApiAnalyticsAspect {
    @Before("com.anilduyguc.aopdemo.joinpoint.expressions.PointcutDeclarations.forDaoPackageNoGetterSetter()")
    public void performApiAnalytics() {
        System.out.println("\n======>>> Performing API analytics :P");
    }
}
