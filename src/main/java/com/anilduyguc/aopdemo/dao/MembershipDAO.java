package com.anilduyguc.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
    public void addAccount(){
        System.out.println(getClass() + ": DOING STUFF: ADDING MEMBERSHIP ACCOUNT");
    }
    public void goToSleep(){
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING ACCOUNT goToSleep()");
    }
}
