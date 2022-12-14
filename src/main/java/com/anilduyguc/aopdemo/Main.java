package com.anilduyguc.aopdemo;

import com.anilduyguc.aopdemo.dao.AccountDAO;
import com.anilduyguc.aopdemo.dao.MembershipDAO;
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

        membershipDAO.addAccount();
        membershipDAO.goToSleep();

        context.close();
    }
}
