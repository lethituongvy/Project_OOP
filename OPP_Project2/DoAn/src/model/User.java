package model;

public abstract class User implements IPerson {
	protected String account;
	protected String password;
	protected int basicSalary;
	protected int dayWork;
	protected int salary;

	public void setAccount(String account) {
		this.account = account;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setSalary() {
		this.salary = this.basicSalary * this.dayWork;
	}

	public void setDayWork(int dayWork) {
		this.dayWork = dayWork;
	}

	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}

	public String getAccount() {
		return account;
	}

	public String getPassword() {
		return password;
	}

	public int getBasicSalary() {
		return basicSalary;
	}

	public int getSalary() {
		return salary;

	}

	public int getDayWork() {
		return dayWork;

	}

}
