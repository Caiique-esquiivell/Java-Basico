package Model;

import Excepetions.BusinessException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawlimit;

    public Account(Integer number, String holder, Double balance, Double withdrawlimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawlimit = withdrawlimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawlimit() {
        return withdrawlimit;
    }

    public void setWithdrawlimit(Double withdrawlimit) {
        this.withdrawlimit = withdrawlimit;
    }

    public void deposit(Double amount){
         balance += amount;
    }

    public void withdraw(Double amount){
        validateWithdraw(amount);
        withdrawlimit -= amount;
    }

    private void validateWithdraw(double amount) {
        if (amount > getWithdrawlimit()) {
            throw new BusinessException("Erro de saque: A quantia excede o limite de saque");
        }
        if (amount > getBalance()) {
            throw new BusinessException("Erro de saque: Saldo insuficiente");
        }
    }

}
