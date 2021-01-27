/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.account.demo;

/**
 *
 * @author devil
 */
public class CreditCard {
   private  long accountid;
   private  String accountname;
    private String address;
    private double balance;
    private double creditlimit;
    
    public boolean withdraw(long amount){
        if(amount<=creditlimit+balance && amount>0){
            balance=balance - amount;
            return true;
        }
        else 
            System.err.printf("you do not have sufficient balance \n");
            return false;
    }
    public boolean deposit(long amount){
        if(amount >0) {
            balance = balance + amount ;
            return true;
        }
         else {
            System.err.printf("Depositing negative amount is not allowed:");
            
           return false; 
                   }
    }
    public void print(){
        System.out.printf("\nId:%d\nName:%s\n Balance :%f Address:%s",accountid,accountname,balance,address );
        
    }

    public CreditCard(long accountid, String accountname, String address, double Creditlimit) {
        this.accountid = accountid;
        this.accountname = accountname;
        this.address = address;
        this.balance = 0 ;
        this.creditlimit = creditlimit;
    }

  

    public long getAccountid() {
        return accountid;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    

    public String getAddress() {
        return address;
    }

    public double getBalance() {
        return balance;
    }

    public double getCreditlimit() {
        return creditlimit;
    }
    
    
    
    
    
    
}
