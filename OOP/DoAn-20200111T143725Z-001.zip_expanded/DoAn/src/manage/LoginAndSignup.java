package manage;

import java.util.Scanner;

import model.Employee;
import model.Manager;
import userData.EmployeeData;
import userData.ManagerData;
import view.Title;

public class LoginAndSignup {
	public void addEmployee() {
		Title title = new Title();
		Scanner input = new Scanner(System.in);
		System.out.println("Dang ky Employee :");
		String user, pass, passagain;

		System.out.println("Nhap thong tin ca nhan:");

		int empCode = (EmployeeData.employee.size() > 0) ? (EmployeeData.employee.size() + 1) : 1;
		System.out.print("Ten nhan vien: ");
		String name = input.next();
		System.out.print("Dia chi: ");
		String address = input.next();
		System.out.print("So dien thoai: ");
		String phone = input.next();
		System.out.print("Luong co ban: ");
		int basicSalary = input.nextInt();
		System.out.print("So ngay lam: ");
		int dayWork = input.nextInt();
		System.out.print("Tuoi: ");
		int age = input.nextInt();
		System.out.print("Ten dang nhap: ");
		user = input.next();

		System.out.print("Mat khau: ");
		pass = input.next();

		do {
			System.out.print("Nhap lai mat khau: ");
			passagain = input.next();

		} while ((passagain.compareTo(pass)) != 0);

		System.out.println("Ban da dang ki thanh cong!");
		Employee m1 = new Employee(user, pass, empCode, name, address, phone, dayWork, basicSalary, age);
		EmployeeData.employee.add(m1);

		System.out.println("Cap nhat thong tin cho nhan vien moi");

		System.out.println("Ban co muon dang nhap khong ? \n1. YES \n2. NO");
		String nhap = input.next();

		if (nhap.equals("1") || nhap.equals("yes") || nhap.equals("YES")) {
			String user1, pass1;

			System.out.println("Ten dang nhap: ");
			user1 = input.next();

			System.out.println("Mat khau: ");
			pass1 = input.next();
			int check = 0;
			for (int i = 0; i < EmployeeData.employee.size(); i++) {

				if (EmployeeData.employee.get(i).getAccount().compareTo(user1) == 0
						&& EmployeeData.employee.get(i).getPassword().compareTo(pass1) == 0) {

					System.out.println("Dang nhap thanh cong!");
					// Run.Manager();
					check++;

				}
			}
			if (check == 0) {
				System.out.println("Tai khoan hoac mat khau khong chinh xac ");
				title.backLogin();
			}
		} else {
			System.out.println("Chuyen toi trang dau");
			title.logout();

		}
	}

	public void addManager() {
		Title title = new Title();
		Scanner input = new Scanner(System.in);
		System.out.println("Dang Ky Manager :");
		String user, pass, passagain;

		System.out.println("Nhap thong tin ca nhan:");

		int manaCode = (ManagerData.manager.size() > 0) ? (ManagerData.manager.size() + 1) : 1;
		System.out.println("Ten quan ly: ");
		String name = input.next();
		System.out.println("Dia chi: ");
		String address = input.next();
		System.out.println("So dien thoai: ");
		String phone = input.next();
		System.out.println("Luong co ban: ");
		int basicSalary = input.nextInt();
		System.out.println("So ngay lam: ");
		int dayWork = input.nextInt();
		System.out.println("Tuoi: ");
		int age = input.nextInt();
		System.out.println("Ten dang nhap: ");
		user = input.next();

		System.out.println("Mat khau: ");
		pass = input.next();

		do {
			System.out.println("Nhap lai mat khau: ");
			passagain = input.next();

		} while ((passagain.compareTo(pass)) != 0);

		System.out.println("Ban da dang ki thanh cong!");
		Manager m1 = new Manager(user, pass, manaCode, name, address, phone, dayWork, basicSalary, age);
		ManagerData.manager.add(m1);

		System.out.println("Ban co muon dang nhap khong ? \n1. YES \n2. NO");
		String nhap = input.next();

		if (nhap.equals("1") || nhap.equals("yes") || nhap.equals("YES")) {
			String user1, pass1;

			System.out.println("Ten dang nhap: ");
			user1 = input.next();

			System.out.println("Mat khau: ");
			pass1 = input.next();
			int check = 0;
			for (int i = 0; i < ManagerData.manager.size(); i++) {

				if (ManagerData.manager.get(i).getAccount().compareTo(user1) == 0
						&& ManagerData.manager.get(i).getPassword().compareTo(pass1) == 0) {

					System.out.println("Dang nhap thanh cong!");
					// Run.Manager();
					check++;

				}
			}
			if (check == 0) {
				System.out.println("Tai khoan hoac mat khau khong chinh xac ");
				title.backLogin();
			}
		} else {
			System.out.println("Chuyen toi trang dau");
			title.logout();

		}
	}

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
				run.employee();
				check++;
			}
		}
		System.out.println(check);
		if (check == 0) {
			System.out.println("Tai khoan hoac mat khau khong chinh xac ");
			title.backLogin();
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
				run.manager();
				break;
			}
		}
		System.out.println(check);
		if (check == 0) {
			System.out.println("Tai khoan hoac mat khau khong chinh xac ");
			title.backLogin();
		}

	}
}
