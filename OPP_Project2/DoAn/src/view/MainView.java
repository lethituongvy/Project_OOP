package view;

import java.util.Scanner;

import manage.Login;
import manage.Order;
import manage.Run;
import manage.Signup;

public class MainView {
	Run run = new Run();
	Order order = new Order();
	ManageView view = new ManageView();
	
	public void login() {

		int c;
		Title title = new Title();
		Login login = new Login();
		title.screen();
		title.screenLogin();
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("1.Employee \n2.Manager");
			c = input.nextInt();
		} while (c != 1 && c != 2);
		if (c == 1) {
			login.employeeLogin();
		} else if (c == 2) {
			login.managerLogin();

		}

	}

	public void employee() {
		Title title = new Title();
		title.screenOfEmployee();
		int n;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Vui long chon :");
			n = input.nextInt();
		} while (n != 1 && n != 2 && n != 3 && n != 4 && n != 5 && n != 6 && n != 7 && n != 8 && n != 9);

		switch (n) {
		case 1:
			run.printOfCustomer();
			title.backToEmployee();
			break;
		case 2:
			run.viewEmployeeProfile();
			title.backToEmployee();
			break;
		case 3:
			run.update();
			title.backToEmployee();
			break;
		case 4:
			run.viewProduct();
			title.backToEmployee();
			break;
		case 5:
			run.viewEmployeeProfile();
			title.backToEmployee();
			break;
		case 6:
			run.viewAProduct();
			title.backToEmployee();
			break;
		case 7:
			run.view();
			title.backToEmployee();
			break;
		case 8:
			order.inputProduct();
			title.backToEmployee();
			break;
		case 9:
			order.sellProduct();
			title.backToEmployee();
			break;
		}

	}

	public void manager() {
		Title title = new Title();
		title.screenOfManager();
		int n;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("\n\nVui long chon: ");
			n = input.nextInt();

		} while (n != 1 && n != 2 && n != 3 && n != 4 && n != 5 && n != 6 && n != 7 && n != 8 && n != 9 && n != 10
				&& n != 11);
		switch (n) {
		case 1:
			view.manageEmployee();
			order.inputProduct();
			break;
		case 2:
			view.manageManger();
			break;
		case 3:
			run.printOfCustomer();
			title.logout();
			break;
		case 4:
			run.viewManagerSalary();
			title.logout();
			break;
		case 5:
			run.viewEmployeeSalary();
			title.logout();
			break;
		case 6:
			run.viewProduct();
			title.logout();
			break;
		case 7:
			run.viewAProduct();
			title.logout();
			break;
		case 8:
			run.view();
			title.logout();
			break;
		case 9:
			run.chancePrice();
			title.logout();
			break;
		case 10:
			order.inputProduct();
			title.logout();
			break;
		case 11:
			order.sellProduct();
			title.logout();
			break;
		}
	}
}
