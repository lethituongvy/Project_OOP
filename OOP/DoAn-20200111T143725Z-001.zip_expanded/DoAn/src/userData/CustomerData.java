package userData;

import java.util.ArrayList;
import java.util.List;

import model.Customer;

public class CustomerData {
	public static List<Customer> CustomerList = new ArrayList<>();

	public static void customerData() {
		int cusCode1 = (CustomerList.size() > 0) ? (CustomerList.size() + 1) : 1;
		Customer customer1 = new Customer(cusCode1, "Nguyen Duy Ngoc", "Quang Tri", "098180123", 18);
		CustomerList.add(customer1);
		int cusCode2 = (CustomerList.size() > 0) ? (CustomerList.size() + 1) : 1;
		Customer customer2 = new Customer(cusCode2, "Ho Van Quan", "Binh Dinh", "01236432", 20);
		CustomerList.add(customer2);
		int cusCode3 = (CustomerList.size() > 0) ? (CustomerList.size() + 1) : 1;
		Customer customer3 = new Customer(cusCode3, "Ho Van Vinh", "Binh Duong", "738563895", 30);
		CustomerList.add(customer3);
		int cusCode4 = (CustomerList.size() > 0) ? (CustomerList.size() + 1) : 1;
		Customer customer4 = new Customer(cusCode4, "Duong Minh Quang", "Nam Dinh", "3959465", 45);
		CustomerList.add(customer4);
		int cusCode5 = (CustomerList.size() > 0) ? (CustomerList.size() + 1) : 1;
		Customer customer5 = new Customer(cusCode5, "Le Hieu ", "Hue ", "6438463", 56);
		CustomerList.add(customer5);
		int cusCode6 = (CustomerList.size() > 0) ? (CustomerList.size() + 1) : 1;
		Customer customer6 = new Customer(cusCode6, "Linh Chi", "Binh Dinh", "46836438", 15);
		CustomerList.add(customer6);
	}
}