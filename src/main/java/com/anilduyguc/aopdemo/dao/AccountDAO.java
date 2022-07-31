package com.anilduyguc.aopdemo.dao;


import com.anilduyguc.aopdemo.Account;
import org.springframework.stereotype.Component;


@Component
public class AccountDAO {
    public void addAccount(Account account, boolean flag){
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING ACCOUNT addAccount()");
    }
    public boolean addSillyMember(){
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING ACCOUNT addSillyMember()");
        return true;
    }
    public boolean doWork(){
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING ACCOUNT doWork()");
        return false;
    }
}
