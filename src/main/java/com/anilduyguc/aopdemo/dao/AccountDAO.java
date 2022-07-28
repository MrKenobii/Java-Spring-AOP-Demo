package com.anilduyguc.aopdemo.dao;


import org.springframework.stereotype.Component;


@Component
public class AccountDAO {
    public void addAccount(){
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING ACCOUNT addAccount()");
    }
    public boolean addSillyMember(){
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING ACCOUNT addSillyMember()");
        return true;
    }
}
