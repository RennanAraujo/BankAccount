/**
 * Qual a estrutura correta dos diretórios?
 * Commitar mudanças na estrutura do projeto
 * */
package com.betadev;
import java.util.Objects;

public class BankAccount{
	//Attributes
	public  int accountNumber;
	protected String accountType;
	private String accountOwner;
	private float accountBalance;
	private String status; //[Opened, Closed, Blocked]

	//Methods
	public void openAccount(String t){
		this.setAccountType(t);
		this.setStatus("Opened");
		if(Objects.equals(t, "CC")){
			this.setAccountBalance(50);
		}else if (Objects.equals(t, "CP")){
			this.setAccountBalance(150);
		}
		System.out.println("Account is opened");
	}
	public void closeAccount(){
		if(Objects.equals(getAccountBalance(), 0)){
			this.setStatus("Closed");
			System.out.println("Account successfully closed"); //evite mostrar coisas dentro de classes, é melhor encapsular
		} else {
			System.out.println("Account can't be closed. Please check account balance");
		}
	}
	public void deposit(float value){
		if(Objects.equals(getStatus(), "Opened")){
			this.setAccountBalance(this.getAccountBalance()+value);
			System.out.println("Deposited in account of " + value);
			System.out.println("Balance is now: " + getAccountBalance());
		}else {
			System.out.println("Account is not open. Please check.");
		}
	}
	public void withdraw(float value){
		if(Objects.equals(getStatus(), "Opened")){
			if( getAccountBalance() >= value){
				this.setAccountBalance(getAccountBalance()-value);
				System.out.println("Withdraw in account of " + value);
				System.out.println("Balance is now: " + getAccountBalance());
			}else {
				System.out.println("Funds insufficient");
			}
		} else {
			System.out.println("Can't withdraw");
		}
	}
	public void payMonthlyFee(float value){
		this.setAccountBalance(this.getAccountBalance()-value);
		System.out.println("Paid monthly fee of " + value);
		System.out.println("Balance is now: " + getAccountBalance());
	}
	public void blockAccount(){
		this.setStatus("Blocked");
	}
	public void summaryAccount(){
		System.out.println("#############################");
		System.out.println("# Owner: " + getAccountOwner());
		System.out.println("# Number: " + getAccountNumber());
		System.out.println("# Type: " + getAccountType());
		System.out.println("# Status: " + getStatus());
		System.out.println("# Balance: " + getAccountBalance());
		System.out.println("#############################");
	}
	//getters and setters
	public void setAccountNumber(int number) {
		this.accountNumber = number;
	}
	public int getAccountNumber(){
		return this.accountNumber;
	}
	public void setAccountType(String type){
		this.accountType = type;
	}
	public String getAccountType(){
		return this.accountType;
	}
	public void setAccountOwner(String name){
		this.accountOwner = name;
	}
	public String getAccountOwner(){
		return this.accountOwner;
	}
	public void setAccountBalance(float balance) {
		this.accountBalance = balance;
	}
	public float getAccountBalance(){
		return this.accountBalance;
	}
	public void setStatus(String status){
		this.status = status;
	}
	public String getStatus(){
		return this.status;
	}
	//Constructor -> same name of class (Capital letter) | after getters and setters
	public BankAccount(){
		this.setAccountBalance(0);
		this.setStatus("Open");
	}
}