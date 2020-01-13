package view;

import java.util.Scanner;

import manage.Run;


public class Title {
	Scanner input = new Scanner(System.in);
	Run run =new Run();

	public void screen() {
		System.out.println("********************CHUONG TRINH QUAN LY CUA HANG DIEN TU********************");

		System.out.println("                      ________________________________");
		System.out.println("                                                      ");
		System.out.println("                                                      ");
		System.out.println("                      **********XIN CHAO BAN**********");
		System.out.println("                                                      ");
		System.out.println("                                                      ");

	}

	public void screenLogin() {
		System.out.println("                     ________________________________");
		System.out.println("                     |     VUI LONG DANG NHAP       |");
		System.out.println("                     |______________________________|\n");
	}

	public  void addEmployee() {
		System.out.println("                     _______________________________");
		System.out.println("                     |         Them nhan vien       |");
		System.out.println("                     |______________________________|\n");
	}

	public  void screenOfManager() {
		System.out.println("_______________________________________________");
		System.out.println("|                                              |");
		System.out.println("|   1. Quan ly nhan vien                       |");
		System.out.println("|   2. Quan ly nguoi quan ly                   |");
		System.out.println("|   3. Xem khach hang                          |");
		System.out.println("|   4. Xem luong quan ly                       |");
		System.out.println("|   5. Xem luong nhan vien                     |");
		System.out.println("|   6. Xem thong tin tat ca san pham           |");
		System.out.println("|   7. Xem danh sach cua mot san pham          |");
		System.out.println("|   8. Chi tiet san pham                       |");
		System.out.println("|   9. Doi gia san pham                        |");
		System.out.println("|  10. Nhap  san pham                          |");
		System.out.println("|  11. Ban  san pham                           |");
		System.out.println("|______________________________________________|");
	}

	public  void screenOfEmployee() {
		System.out.println("_______________________________________________");
		System.out.println("|                                              |");
		System.out.println("|   1. Xem khach hang                          |");
		System.out.println("|   2. Xem thong tin cua ban                   |");
		System.out.println("|   3. Thay doi thong tin cua ban              |");
		System.out.println("|   4. Xem thong tin  tat ca san pham          |");
		System.out.println("|   5. Xem luong nhan vien                     |");
		System.out.println("|   6. Xem danh sach cua mot san pham          |");
		System.out.println("|   7. Chi tiet san pham                       |");
		System.out.println("|   8. Nhap san pham                           |");
		System.out.println("|   9. Ban san pham                            |");
		System.out.println("|______________________________________________|");
	}

	public  void manageEmployees() {
		System.out.println("_______________________________");
		System.out.println("|                              |");
		System.out.println("|   1. Danh sach nhan vien     |");
		System.out.println("|   2. Them nhan vien 	       |");
		System.out.println("|   3. Sua nhan vien           |");
		System.out.println("|   4. Xoa nhan vien           |");
		System.out.println("|______________________________|");
	}

	public  void manageManagers() {
		System.out.println("_______________________________");
		System.out.println("|                              |");
		System.out.println("|   1. Danh sach quan ly       |");
		System.out.println("|   2. Them quan ly 	       |");
		System.out.println("|   3. Sua quan ly             |");
		System.out.println("|   4. Xoa quan ly             |");
		System.out.println("|______________________________|");
	}

	public  void backLogin() {
		int a;
		System.out.println("Ban co muon dang nhap lai khong ?");
		System.out.println("1.Co \n2.Khong");
		do {
			System.out.println("\tVui long chon :");
			a = input.nextInt();
		} while (a != 1 && a != 2);
		if (a == 1) {
			run.login();
		} else {
			System.exit(0);
		}
	}

	public  void logout() {
		int i;
		System.out.println("\n\n\t\t\t************BACK*************");
		System.out.println("1.  Quay lai quan li nhan vien  ");
		System.out.println("2.  Quay lai quan li            ");
		System.out.println("3.  Quay lai Manager      	    ");
		System.out.println("4.  Dang nhap lai               ");
		System.out.println("5.  Xem lai thong tin san pham               ");
		System.out.println("6.  Xem thong tin san pham khac              ");
		System.out.println("7. Chi tiet san pham");
		System.out.println("8. Doi  san pham");
		System.out.println("9. Nhap san pham");
		System.out.println("10. Ban san pham");
		System.out.println("11.  Thoat chuong trinh   	    ");
		Run run =new Run();
		do {
			System.out.println("\tVui long chon :");
			i = input.nextInt();
		} while (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 7 && i != 8 && i != 9 && i != 10
				&& i != 11);
		switch (i) {
		case 1:
			System.out.println("____________________________________");
			run.manageEmployee();
			break;
		case 2:
			System.out.println("____________________________________");
			run.manageManger();
			break;
		case 3:
			System.out.println("____________________________________");
			run.manager();
			break;
		case 4:
			System.out.println("____________________________________");
			run.login();
		case 5:
			System.out.println("____________________________________");
			run.viewProduct();
		case 6:
			System.out.println("____________________________________");
			run.viewAProduct();
		case 7:
			System.out.println("____________________________________");
			run.view();
		case 8:
			System.out.println("____________________________________");
			run.chancePrice();
		case 9:
			System.out.println("____________________________________");
			//Order.inputProduct();
			break;
		case 10:
			System.out.println("____________________________________");
			//Order.sellProduct();
			break;
		case 11:
			System.out.println("____________________________________");
			System.out.println("\n Cam on ban da dung chuong trinh. ");
			System.exit(0);
			break;

		}
	}

	public  void backToEmployee() {
		int i;
		System.out.println("\n\n\t\t\t************BACK*************");
		System.out.println("1.  Quay lai Employee ");
		System.out.println("2.  Dang nhap lai           ");
		System.out.println("3.  Xem lai thong tin 1 san pham      	    ");
		System.out.println("4.  Xem lai thong tin san pham               ");
		System.out.println("5. Chi tiet san pham");
		System.out.println("6.Nhap san pham");
		System.out.println("7.Ban san pham");
		System.out.println("8.  Thoat chuong trinh   	    ");

		do {
			System.out.println("\tVui long chon :");
			i = input.nextInt();
		} while (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 7 && i != 8);
		switch (i) {
		case 1:
			System.out.println("____________________________________");
			run.employee();
			break;
		case 2:
			System.out.println("____________________________________");
			run.login();
			break;
		case 3:
			System.out.println("____________________________________");
			run.viewAProduct();
			break;
		case 4:
			System.out.println("____________________________________");
			run.viewProduct();
			break;
		case 5:
			System.out.println("____________________________________");
			run.view();
			break;
		case 6:
			System.out.println("____________________________________");
			//Order.inputProduct();
			break;
		case 7:
			System.out.println("____________________________________");
			//Order.sellProduct();
			break;
		case 8:
			System.out.println("____________________________________");
			System.out.println("\n Cam on ban da dung chuong trinh. ");
			System.exit(0);

			break;
		}
	}
}
