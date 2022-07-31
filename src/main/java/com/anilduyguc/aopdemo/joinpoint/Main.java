package com.anilduyguc.aopdemo.joinpoint;

import com.anilduyguc.aopdemo.joinpoint.dao.AccountDAO;
import com.anilduyguc.aopdemo.joinpoint.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
        Account account = new Account();
        account.setName("John");
        account.setLevel("123");
        accountDAO.addAccount(account, true);
        accountDAO.addSillyMember();
        accountDAO.doWork();

        accountDAO.setAccountName("FooName");
        accountDAO.setServiceCode("gold");

        String name = accountDAO.getAccountName();
        String serviceCode = accountDAO.getServiceCode();

        membershipDAO.addAccount();
        membershipDAO.goToSleep();

        context.close();
    }
}
