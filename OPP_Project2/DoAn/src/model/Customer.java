package model;

public class Customer implements IPerson {

	private int id;
	private String name;
	private String address;
	private String phone;
	private int age;

	public Customer() {
	}

	public Customer(int id, String name, String address, String phone, int age) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.age = age;
	}

	@Override
	public void setId(int id) {
		this.id = id;

	}

	@Override
	public void setName(String name) {
		this.name = name;

	}

	@Override
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public String getAddress() {
		return address;
	}

	@Override
	public String getPhone() {
		return phone;
	}

	public String toString() {
		return "Id: " + id + "\n" + "Ten: " + name + "\n" + "Dia chi: " + address + "\n" + "so dien thoai: " + phone
				+ "\n" + "Tuoi: " + age + "\n";
	}

}
