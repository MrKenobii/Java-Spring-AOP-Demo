package com.anilduyguc.aopdemo.pointcut.expressions;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutDeclarations {

    @Pointcut("execution(* com.anilduyguc.aopdemo.pointcut.dao.*.*(..))")
    public void forDaoPackage(){}

    @Pointcut("execution(* com.anilduyguc.aopdemo.pointcut.dao.*.get*(..))")
    public void getter(){}

    @Pointcut("execution(* com.anilduyguc.aopdemo.pointcut.dao.*.set*(..))")
    public void setter(){}

    @Pointcut("forDaoPackage() && !(getter() || setter())")
    public void forDaoPackageNoGetterSetter(){}
}
