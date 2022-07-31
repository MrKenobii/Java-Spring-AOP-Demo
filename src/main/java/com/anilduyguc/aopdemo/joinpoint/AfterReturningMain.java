package com.anilduyguc.aopdemo.joinpoint;

import com.anilduyguc.aopdemo.joinpoint.dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AfterReturningMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);

        List<Account> accounts = accountDAO.findAccounts();
        System.out.println("\n\nMain program: AfterReturningMain");
        for(Account account: accounts) {
            System.out.println(account);
        }

        context.close();
    }
}
