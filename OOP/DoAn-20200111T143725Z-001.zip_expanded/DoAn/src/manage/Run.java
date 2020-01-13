package manage;

import java.util.Scanner;
import model.Customer;
import model.Product;
import userData.CustomerData;
import userData.EmployeeData;
import userData.ManagerData;
import userData.ProductData;
import view.Title;

public class Run {
	Order order = new Order();
	Product product = new Product();
	Customer customer = new Customer();
	ManagerData mana= new ManagerData();

	public void login() {

		int c;
		Title title = new Title();
		LoginAndSignup login = new LoginAndSignup();
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
			printOfCustomer();
			title.backToEmployee();
			break;
		case 2:
			viewEmployeeProfile();
			title.backToEmployee();
			break;
		case 3:
			update();
			title.backToEmployee();
			break;
		case 4:
			viewProduct();
			title.backToEmployee();
			break;
		case 5:
			viewEmployeeProfile();
			title.backToEmployee();
			break;
		case 6:
			viewAProduct();
			title.backToEmployee();
			break;
		case 7:
			view();
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

	public void manageEmployee() {
		LoginAndSignup login = new LoginAndSignup();
		Title title = new Title();
		title.manageEmployees();
		int chose, i;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("\n\nVui long chon :");
			chose = input.nextInt();
		} while (chose != 1 && chose != 2 && chose != 3 && chose != 4);
		switch (chose) {
		case 1:
			printOfEmployee();
			title.logout();
			break;
		case 2:
			login.addEmployee();
			title.logout();
			break;
		case 3:
			do {
				System.out.println("Vui long chon: \n\n\t\t1.Thay doi luong.\n\n\t\t2.Thay doi thong tin khac.");
				i = input.nextInt();

			} while (i != 1 && i != 2);

			switch (i) {
			case 1:
				salaryEmployee();
				title.logout();
				break;

			case 2:
				updateOfEmployee();
				title.logout();
				break;
			}
		case 4:
			removeOfEmployee();
			title.logout();
			break;
		}

	}

	public void manageManger() {
		Title title = new Title();
		title.manageManagers();
		LoginAndSignup login = new LoginAndSignup();
		int chose, i;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("\n\nVui long chon :");
			chose = input.nextInt();
		} while (chose != 1 && chose != 2 && chose != 3 && chose != 4);

		switch (chose) {
		case 1:
			printOfManager();
			title.logout();
			break;
		case 2:
			login.addManager();
			title.logout();
			break;
		case 3:
			do {
				System.out.println("Vui long chon: \n\n\t\t1.Thay doi luong.\n\n\t\t2.Thay doi thong tin khac.");
				i = input.nextInt();

			} while (i != 1 && i != 2);

			switch (i) {
			case 1:
				salaryMamager();
				title.logout();
				break;

			case 2:
				updateOfManager();
				title.logout();
				break;
			}
		case 4:
			removeOfManager();
			title.logout();
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
			manageEmployee();
			order.inputProduct();
			break;
		case 2:
			manager();
			break;
		case 3:
			printOfCustomer();
			title.logout();
			break;
		case 4:
			viewManagerSalary();
			title.logout();
			break;
		case 5:
			viewEmployeeSalary();
			title.logout();
			break;
		case 6:
			viewProduct();
			title.logout();
			break;
		case 7:
			viewAProduct();
			title.logout();
			break;
		case 8:
			view();
			title.logout();
			break;
		case 9:
			chancePrice();
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

	public void printOfEmployee() {

		System.out.println("\n\n\t****THONG TIN NHAN VIEN****");
		for (int i = 0; i < EmployeeData.employee.size(); i++) {
			System.out.println(EmployeeData.employee.get(i));
		}
	}

	public void printOfCustomer() {

		System.out.println("\n\n\t****THONG TIN KHACH HANG****");
		for (int i = 0; i < CustomerData.CustomerList.size(); i++) {
			System.out.println(CustomerData.CustomerList.get(i));
		}
	}

	public void viewManagerSalary() {
		Scanner input = new Scanner(System.in);
		System.out.println("\n\n\t****THONG TIN LUONG****");
		System.out.print("ID quan ly: ");
		int n = input.nextInt();
		for (int i = 0; i < ManagerData.manager.size(); i++) {
			if (i == (n - 1)) {
				System.out.println(ManagerData.manager.get(i));
			}
		}
	}

	public void viewEmployeeSalary() {
		Scanner input = new Scanner(System.in);
		System.out.println("\n\n\t****THONG TIN LUONG****");

		System.out.print("ID nhan vien : ");
		int n = input.nextInt();
		for (int i = 0; i < EmployeeData.employee.size(); i++) {
			if (i == (n - 1)) {
				System.out.println(EmployeeData.employee.get(i));
			}
		}
	}

	public void viewEmployeeProfile() {
		Scanner input = new Scanner(System.in);

		System.out.println("\n\n\t\t\t****THONG TIN CUA BAN****");
		System.out.print("\nChung toi lo ngai rang khi ban dang nhap vao tai khoan,");
		System.out.print("\nnhung khi ban ra ngoai co nguoi khac vao xem trom thong");
		System.out.print("\ntin cua ban. Vi vay, xin vui long nhap lai : \n");
		System.out.print("Ten dang nhap: ");
		String user1 = input.next();

		System.out.print("Mat khau: ");
		String pass1 = input.next();
		for (int i = 0; i < EmployeeData.employee.size(); i++) {

			if (EmployeeData.employee.get(i).getAccount().compareTo(user1) == 0
					&& EmployeeData.employee.get(i).getPassword().compareTo(pass1) == 0) {
				System.out.println(EmployeeData.employee.get(i));
			}
		}
	}

	public void salaryEmployee() {
		Scanner input = new Scanner(System.in);
		System.out.println("\n\n\t****NHAP THONG TIN****");

		System.out.print("Nhap id:  ");
		int id = input.nextInt();
		System.out.print("Nhap luong co ban cua nhan vien:  ");
		int basicSalary = input.nextInt();
		for (int i = 0; i < EmployeeData.employee.size(); i++) {

			if (EmployeeData.employee.get(i).getId() == id) {
				EmployeeData.employee.get(id - 1).setBasicSalary(basicSalary);
				System.out.println(EmployeeData.employee.get(id - 1));
			}
		}
	}

	public void salaryMamager() {
		Scanner input = new Scanner(System.in);
		System.out.println("\n\n\t****NHAP THONG TIN****");

		System.out.println("Nhap id:  ");
		int id = input.nextInt();
		System.out.println("Nhap luong co ban cua nguoi quan ly nay:  ");
		int basicSalary = input.nextInt();
		for (int i = 0; i < ManagerData.manager.size(); i++) {

			if (ManagerData.manager.get(i).getId() == id) {
				ManagerData.manager.get(id - 1).setBasicSalary(basicSalary);
				System.out.println(ManagerData.manager.get(id - 1));
			}
		}
	}

	public void removeOfEmployee() {
		Scanner input = new Scanner(System.in);
		printOfEmployee();
		System.out.println("\n\n\t****XOA THONG TIN NHAN VIEN****");
		System.out.print("ID NHAN VIEN: ");
		int n = input.nextInt();

		EmployeeData.employee.remove(n - 1);
		System.out.println("Thong tin nhan vien sau khi xoa");

		for (int i = 0; i < EmployeeData.employee.size(); i++) {
			System.out.println(EmployeeData.employee.get(i));
		}

	}

	public void updateOfEmployee() {
		Scanner input = new Scanner(System.in);
		printOfEmployee();
		System.out.println("****Update Thong Tin****");
		System.out.print("ID NHAN VIEN: ");
		int n = input.nextInt();

		System.out.println(EmployeeData.employee.get(n - 1));
		System.out.println("Chon thong tin muon sua");
		System.out.println("1.Name\n2.Address\n3.Phone");
		int a;
		do {
			a = input.nextInt();
			System.out.print("\tVui long chon");
		} while (a != 1 && a != 2 && a != 3);

		switch (a) {
		case 1:
			System.out.print("TEN NHAN VIEN: ");
			String name = input.next();
			EmployeeData.employee.get(n - 1).setName(name);
			System.out.println(EmployeeData.employee.get(n - 1));
			break;
		case 2:
			System.out.print("DIA CHI NHAN VIEN: ");
			String address = input.next();
			EmployeeData.employee.get(n - 1).setAddress(address);
			System.out.println(EmployeeData.employee.get(n - 1));
			break;
		case 3:
			System.out.print("SO DIEN THOAI NHAN VIEN: ");
			String phone = input.next();
			EmployeeData.employee.get(n - 1).setPhone(phone);
			System.out.println(EmployeeData.employee.get(n - 1));
			break;
		}

	}

	public void update() {
		Scanner input = new Scanner(System.in);
		System.out.println("****Update Thong Tin****");
		System.out.print("\nChung toi lo ngai rang khi ban dang nhap vao tai khoan,");
		System.out.print("\nnhung khi ban ra ngoai co nguoi khac vao xem trom thong");
		System.out.print("\ntin cua ban. Vi vay, xin vui long nhap lai : \n");
		System.out.print("Ten dang nhap: ");
		String user1 = input.next();

		System.out.print("Mat khau: ");
		String pass1 = input.next();
		for (int i = 0; i < EmployeeData.employee.size();) {

			if (EmployeeData.employee.get(i).getAccount().compareTo(user1) == 0
					&& EmployeeData.employee.get(i).getPassword().compareTo(pass1) == 0) {

				System.out.println(EmployeeData.employee.get(EmployeeData.employee.get(i).getId() - 1));
			}
			System.out.println("Chon thong tin muon sua");
			System.out.println("1.Name\n2.Address\n3.Phone");
			int a;
			do {
				a = input.nextInt();
				System.out.println("\tVui long chon");
			} while (a != 1 && a != 2 && a != 3);

			switch (a) {
			case 1:
				System.out.print("TEN NHAN VIEN: ");
				String name = input.next();

				EmployeeData.employee.get(EmployeeData.employee.get(i).getId() - 1).setName(name);
				System.out.println(EmployeeData.employee.get(EmployeeData.employee.get(i).getId() - 1));
				break;
			case 2:
				System.out.print("DIA CHI NHAN VIEN: ");
				String address = input.next();

				EmployeeData.employee.get(EmployeeData.employee.get(i).getId() - 1).setAddress(address);
				System.out.println(EmployeeData.employee.get(EmployeeData.employee.get(i).getId() - 1));
				break;
			case 3:
				System.out.print("SO DIEN THOAI NHAN VIEN: ");
				String phone = input.next();
				EmployeeData.employee.get(EmployeeData.employee.get(i).getId() - 1).setPhone(phone);
				System.out.println(EmployeeData.employee.get(EmployeeData.employee.get(i).getId() - 1));
				break;
			}
			break;
		}

	}

	public void printOfManager() {

		System.out.println("\n\n\t****THONG TIN QUAN LY****");
		for (int i = 0; i < ManagerData.manager.size(); i++) {
			System.out.println(ManagerData.manager.get(i));
		}
	}

	public void removeOfManager() {
		Scanner input = new Scanner(System.in);
		printOfManager();
		System.out.println("\n\n\t****XOA THONG TIN QUAN LY****");
		System.out.print("ID MANAGER: ");
		int n = input.nextInt();

		ManagerData.manager.remove(n - 1);
		System.out.println("Thong tin quan ly sau khi xoa");

		for (int i = 0; i < ManagerData.manager.size(); i++) {
			System.out.println(ManagerData.manager.get(i));
		}

	}

	public void updateOfManager() {
		printOfManager();
		Scanner input = new Scanner(System.in);
		System.out.println("****Update Thong Tin****");
		System.out.print("ID QUAN LY: ");
		int n = input.nextInt();

		System.out.println(ManagerData.manager.get(n - 1));
		System.out.println("Chon thong tin muon sua");
		System.out.println("1.Name\n2.Address\n3.Phone");
		int a;
		do {
			a = input.nextInt();
			System.out.println("\tVui long chon");
		} while (a != 1 && a != 2 && a != 3);

		switch (a) {
		case 1:
			System.out.println("\nNhap ten: ");
			String name = input.next();
			ManagerData.manager.get(n - 1).setName(name);
			System.out.println(ManagerData.manager.get(n - 1));
			break;
		case 2:
			System.out.println("\nNhap ten: ");
			String address = input.next();
			ManagerData.manager.get(n - 1).setAddress(address);
			System.out.println(ManagerData.manager.get(n - 1));
			break;
		case 3:
			System.out.println("\nNhap ten: ");
			String phone = input.next();
			ManagerData.manager.get(n - 1).setPhone(phone);
			System.out.println(ManagerData.manager.get(n - 1));
			break;
		}

	}

	public void viewProduct() {
		System.out.println("\n\n\t****THONG TIN SAN PHAM****");
		for (int i = 0; i < ProductData.productList.size(); i++) {

			System.out.println(ProductData.productList.get(i));
		}
	}

	public void viewAProduct() {
		String id;
		System.out.println("\n\n\t****THONG TIN PRODUCT****");
		Scanner input = new Scanner(System.in);
		System.out.println("Id product: ");
		id = input.next();

		for (int i = 0; i < ProductData.productList.size(); i++) {

			if (id.equals(ProductData.productList.get(i).getTypeCode())) {
				System.out.println(ProductData.productList.get(i));
			}
		}
	}

	public void view() {
		System.out.println("\n\n\t****THONG TIN CHI TIET CUA MOT SAN PHAM****");
		Scanner input = new Scanner(System.in);
		System.out.println("ID type: ");
		String idType = input.next();

		System.out.println("ID product:  ");
		int id = input.nextInt();
		for (int i = 0; i < EmployeeData.employee.size(); i++) {

			if (ProductData.productList.get(i).getTypeCode().compareTo(idType) == 0
					&& ProductData.productList.get(i).getProductId() == id) {
				System.out.println(ProductData.productList.get(i).toString());
			}
		}
	}

	public void chancePrice() {
		viewProduct();
		System.out.println("****THAY DOI GIA SAN PHAM****");
		Scanner input = new Scanner(System.in);
		System.out.println("ID type: ");
		String id = input.next();

		System.out.println("ID product:  ");
		int id1 = input.nextInt();
		System.out.println("Nhap gia moi:  ");
		int n = input.nextInt();

		for (int i = 0; i < ProductData.productList.size(); i++) {
			if (ProductData.productList.get(i).getTypeCode().compareTo(id) == 0
					&& ProductData.productList.get(i).getProductId() == id1) {
				ProductData.productList.get(i).setPrice(n);
				System.out.println(ProductData.productList.get(i));

			}

		}

	}

}
