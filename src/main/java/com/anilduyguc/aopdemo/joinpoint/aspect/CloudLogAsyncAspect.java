package com.anilduyguc.aopdemo.joinpoint.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class CloudLogAsyncAspect {
    @Before("com.anilduyguc.aopdemo.joinpoint.expressions.PointcutDeclarations.forDaoPackageNoGetterSetter()")
    public void logToCloudAsync() {
        System.out.println("\n======>>> Logging into Cloud :)");
    }
}
