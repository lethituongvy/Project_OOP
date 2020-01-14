package main;

import data.CustomerData;
import data.EmployeeData;
import data.ManagerData;
import data.ProductData;
import view.MainView;

public class Main {

	public static void main(String[] args) {
		MainView title = new MainView();
		ManagerData.managerData();
		EmployeeData.employeeData();
		ProductData.productData();
		CustomerData.customerData();
		title.login();
	}

}
