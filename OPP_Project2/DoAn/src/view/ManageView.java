package view;

import java.util.Scanner;

import manage.Login;
import manage.Run;
import manage.Signup;

public class ManageView {
	Run run = new Run ();
	public void manageManger() {
		Signup signup = new Signup();
		Title title = new Title();
		title.manageManagers();
		Login login = new Login();
		int chose, i;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("\n\nVui long chon :");
			chose = input.nextInt();
		} while (chose != 1 && chose != 2 && chose != 3 && chose != 4);

		switch (chose) {
		case 1:
			run.printOfManager();
			title.logout();
			break;
		case 2:
			signup.addManager();
			title.logout();
			break;
		case 3:
			do {
				System.out.println("Vui long chon: \n\n\t\t1.Thay doi luong.\n\n\t\t2.Thay doi thong tin khac.");
				i = input.nextInt();

			} while (i != 1 && i != 2);

			switch (i) {
			case 1:
				run.salaryMamager();
				title.logout();
				break;

			case 2:
				run.updateOfManager();
				title.logout();
				break;
			}
		case 4:
			run.removeOfManager();
			title.logout();
			break;
		}

	}
	public void manageEmployee() {
		Login login = new Login();
		Title title = new Title();
		Signup signup = new Signup();
		title.manageEmployees();
		int chose, i;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("\n\nVui long chon :");
			chose = input.nextInt();
		} while (chose != 1 && chose != 2 && chose != 3 && chose != 4);
		switch (chose) {
		case 1:
			run.printOfEmployee();
			title.logout();
			break;
		case 2:
			signup.addEmployee();
			title.logout();
			break;
		case 3:
			do {
				System.out.println("Vui long chon: \n\n\t\t1.Thay doi luong.\n\n\t\t2.Thay doi thong tin khac.");
				i = input.nextInt();

			} while (i != 1 && i != 2);

			switch (i) {
			case 1:
				run.salaryEmployee();
				title.logout();
				break;

			case 2:
				run.updateOfEmployee();
				title.logout();
				break;
			}
		case 4:
			run.removeOfEmployee();
			title.logout();
			break;
		}

	}
}
