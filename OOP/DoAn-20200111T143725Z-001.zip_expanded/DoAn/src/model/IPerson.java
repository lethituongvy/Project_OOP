package model;

public interface IPerson {
	public abstract void setId(int id);

	public abstract void setName(String name);

	public abstract void setAge(int age);

	public abstract void setAddress(String address);

	public abstract void setPhone(String phone);

	public abstract int getId();

	public abstract String getName();

	public abstract int getAge();

	public abstract String getAddress();

	public abstract String getPhone();

}
