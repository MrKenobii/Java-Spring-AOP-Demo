package com.anilduyguc.aopdemo.joinpoint.expressions;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutDeclarations {

    @Pointcut("execution(* com.anilduyguc.aopdemo.joinpoint.dao.*.*(..))")
    public void forDaoPackage(){}

    @Pointcut("execution(* com.anilduyguc.aopdemo.joinpoint.dao.*.get*(..))")
    public void getter(){}

    @Pointcut("execution(* com.anilduyguc.aopdemo.joinpoint.dao.*.set*(..))")
    public void setter(){}

    @Pointcut("forDaoPackage() && !(getter() || setter())")
    public void forDaoPackageNoGetterSetter(){}
}
