package com.anilduyguc.aopdemo.pointcut;

import com.anilduyguc.aopdemo.pointcut.dao.AccountDAO;
import com.anilduyguc.aopdemo.pointcut.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

        accountDAO.addAccount(new Account(), true);
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
