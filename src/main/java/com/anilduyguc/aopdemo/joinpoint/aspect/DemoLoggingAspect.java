package com.anilduyguc.aopdemo.joinpoint.aspect;


import com.anilduyguc.aopdemo.joinpoint.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
@Order(3)
public class DemoLoggingAspect {

    @AfterThrowing(
            pointcut="execution(* com.anilduyguc.aopdemo.joinpoint.dao.AccountDAO.findAccounts(..))",
            throwing = "exception"
    )
    public void afterThrowingFindAccountsAdvice(JoinPoint joinPoint, Throwable exception){
        String method = joinPoint.getSignature().toShortString();
        System.out.println("\n======>>>> Executing @AfterThrowing on method: " + method);

        System.out.println("\n======>>>> The exception is: " + exception);
    }

    @AfterReturning(
            pointcut="execution(* com.anilduyguc.aopdemo.joinpoint.dao.AccountDAO.findAccounts(..))",
            returning="accounts"
    )
    public void afterReturningFindAccountsAdvice(JoinPoint joinPoint, List<Account> accounts){
        String method = joinPoint.getSignature().toShortString();
        System.out.println("\n======>>>> Executing @AfterReturning on method: " + method);

        System.out.println("\n======>>>> Result is:  " + accounts);
        convertAccountNamesToUpperCase(accounts);
        System.out.println("\n======>>>> Result is(after uppercase):  " + accounts);
    }

    private void convertAccountNamesToUpperCase(List<Account> accounts) {
        for(Account account: accounts){
            account.setName(account.getName().toUpperCase());
        }
    }

    @Before("com.anilduyguc.aopdemo.joinpoint.expressions.PointcutDeclarations.forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice(JoinPoint joinpoint){
        System.out.println("\n======>>> Executing @Before advice on add*()"); // this will run before the addAccount method

        System.out.println("Method: " + joinpoint.getSignature());

        for(Object arg: joinpoint.getArgs()) {
            System.out.println(arg);
            if(arg instanceof Account) {
                Account account = (Account) arg;
                System.out.println("Account name: " + account.getName());
                System.out.println("Account level: " + account.getLevel());
            }
        }
    }

}
