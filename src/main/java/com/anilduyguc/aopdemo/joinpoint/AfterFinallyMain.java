package com.anilduyguc.aopdemo.joinpoint;

import com.anilduyguc.aopdemo.joinpoint.dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AfterFinallyMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        List<Account> accounts = null;
        try{
            boolean flag = true;
            accounts = accountDAO.findAccounts(flag);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("\n\nMain program: AfterFinallyMain");
        for(Account account: accounts) {
            System.out.println(account);
        }


        context.close();
    }
}
