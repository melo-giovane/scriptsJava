package introOrientacaoObjetos.exercicioContaBancaria.entities;

public class Conta {
    private String name;
    private double balance;
    private int accNumber;

    public Conta(String name, double balance, int accNumber){
        this.name = name;
        this.balance = balance;
        this.accNumber = accNumber;
    }

    public Conta(String name, int accNumber){
        this.name = name;
        this. accNumber = accNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value){
        balance += value;
    }
    public void withdraw(double value){
        balance -= value+5.00;
    }

    public int getAccNumber() {
        return accNumber;
    }


    @Override
    public String toString() {
        return "Account " + accNumber + ", Holder: "
                + name + ", Balance: $" + balance;
    }
}
