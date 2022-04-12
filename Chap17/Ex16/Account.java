package Chap17.Ex16;

import java.util.Objects;


public class Account {
	private String ano; 	//계좌변호
	private String ownew; 	//계좌 주 , 이름
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwnew() {
		return ownew;
	}

	public void setOwnew(String ownew) {
		this.ownew = ownew;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	private int balance; 	//통장 금액,
	
	public Account(String ano, String ownew, int balance) {
		this.ano=ano;
		this.ownew=ownew;
		this.balance=balance;
	}	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Account) {
			this.ano.equals(((Account)obj).ano);
			return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ano);
	}
	
}
