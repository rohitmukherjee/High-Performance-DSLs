package dsl;

import java.util.ArrayList;
import java.util.List;

public class Account {
	public enum STATUS {
		OPEN, CLOSED
	}

	public enum TYPE {
		TRADING, SETTLEMENT, BOTH
	}

	private String number;
	private String firstName;
	private List<String> names = new ArrayList<String>();
	private STATUS status = STATUS.OPEN;
	private TYPE accountType = TYPE.TRADING;
	private double interestAccrued = 0.0;

	public Account(String number, String firstName) {
		this.setNumber(number);
		this.setFirstName(firstName);
	}

	public Account(String number, String firstName, TYPE accountType) {
		this(number, firstName);
		this.setAccountType(accountType);
	}

	public double calculate(final Calculator c) {
		interestAccrued = c.calculate(this);
		return interestAccrued;
	}

	public boolean isOpen() {
		return getStatus().equals(STATUS.OPEN);
	}

	public Account addName(String name) {
		getNames().add(name);
		return this;
	}

	public TYPE getAccountType() {
		return accountType;
	}

	public String getNumber() {
		return number;
	}

	public String getFirstName() {
		return firstName;
	}

	public double getInterestAccrued() {
		return interestAccrued;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setInterestAccrued(double interestAccrued) {
		this.interestAccrued = interestAccrued;
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}

	public void setAccountType(TYPE accountType) {
		this.accountType = accountType;
	}
}
