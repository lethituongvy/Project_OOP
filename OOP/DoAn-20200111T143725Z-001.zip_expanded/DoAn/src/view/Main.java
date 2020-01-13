package view;

import manage.Run;
import userData.CustomerData;
import userData.EmployeeData;
import userData.ManagerData;
import userData.ProductData;

public class Main {

	public static void main(String[] args) {
		Run run = new Run();
		
		ManagerData.managerData();
		EmployeeData.employeeData();
		ProductData.productData();
		CustomerData.customerData();
		run.login();
	}

}
