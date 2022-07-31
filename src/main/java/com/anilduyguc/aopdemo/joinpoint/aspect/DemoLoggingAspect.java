package com.anilduyguc.aopdemo.joinpoint.aspect;



import com.anilduyguc.aopdemo.joinpoint.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class DemoLoggingAspect {

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
