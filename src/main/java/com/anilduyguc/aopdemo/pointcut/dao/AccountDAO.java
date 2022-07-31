package com.anilduyguc.aopdemo.pointcut.dao;


import com.anilduyguc.aopdemo.pointcut.Account;
import org.springframework.stereotype.Component;


@Component
public class AccountDAO {
    private String accountName;
    private String serviceCode;

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

    public String getAccountName() {
        System.out.println(getClass() + " getAccountName()");
        return accountName;
    }

    public void setAccountName(String accountName) {
        System.out.println(getClass() + " setAccountName()");
        this.accountName = accountName;
    }

    public String getServiceCode() {
        System.out.println(getClass() + " getServiceCode()");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println(getClass() + " setServiceCode()");
        this.serviceCode = serviceCode;
    }
}
