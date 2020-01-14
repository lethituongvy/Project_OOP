package manage;

import java.util.Scanner;

import data.EmployeeData;
import data.ManagerData;
import model.Employee;
import model.Manager;
import view.MainView;
import view.Title;

public class Login {
	MainView mainView = new MainView();
	public void employeeLogin() {
		Run run = new Run();
		Title title = new Title();
		Scanner input = new Scanner(System.in);
		System.out.println("Dang Nhap Employee:");
		String user3, pass3;
		System.out.println("Ten dang nhap: ");
		user3 = input.next();
		System.out.println("Mat khau: ");
		pass3 = input.next();

		int check = 0;
		for (int i = 0; i < EmployeeData.employee.size(); i++) {
			if (EmployeeData.employee.get(i).getAccount().compareTo(user3) == 0
					&& EmployeeData.employee.get(i).getPassword().compareTo(pass3) == 0) {
				System.out.println("Dang nhap thanh cong!");
				mainView.employee();
				check++;
			}
		}
		System.out.println(check);
		if (check == 0) {
			System.out.println("Tai khoan hoac mat khau khong chinh xac ");
			title.backLoginEmployee();
		}
	}

	public void managerLogin() {
		Title title = new Title();
		Run run = new Run();
		Scanner input = new Scanner(System.in);
		System.out.println("Dang Nhap Manager");
		String user4, pass4;
		System.out.println("Ten dang nhap: ");
		user4 = input.next();
		System.out.println("Mat khau: ");
		pass4 = input.next();
		System.out.println(user4);
		System.out.println(pass4);
		int check = 0;
		for (int i = 0; i < ManagerData.manager.size(); i++) {
			if ((ManagerData.manager.get(i).getAccount().compareTo(user4) == 0)
					&& (ManagerData.manager.get(i).getPassword().compareTo(pass4) == 0)) {
				System.out.println("\nDang nhap thanh cong!");
				check = check + 1;
				mainView.manager();
				break;
			}
		}
		System.out.println(check);
		if (check == 0) {
			System.out.println("Tai khoan hoac mat khau khong chinh xac ");
			title.backLoginManager();
		}

	}
}
