package manage;

import java.util.Scanner;

import data.CustomerData;
import data.ProductData;
import model.Customer;
import model.Product;

public class Order {

	public void inputProduct() {
		Scanner input = new Scanner(System.in);
		String typeCode, productName, status, productDetailt, typeName;
		int price = 0, quantity;
		System.out.println("DON NHAP HANG");
		System.out.println("NHAP THONG TIN ");
		System.out.println("MA LOAI: ");
		typeCode = input.nextLine();
		System.out.println("MA SAN PHAM: ");
		Scanner input1 = new Scanner(System.in);
		int productId = input1.nextInt();
		do {
			System.out.println("SO LUONG: ");
			Scanner input2 = new Scanner(System.in);
			quantity = input2.nextInt();
		} while (quantity <= 0);

		for (int i = 0; i < ProductData.productList.size(); i++) {
			if (ProductData.productList.get(i).getTypeCode().compareTo(typeCode) == 0
					&& ProductData.productList.get(i).getProductId() == productId) {
				ProductData.productList.get(i).setQuantity(ProductData.productList.get(i).getQuantity() + quantity);
			} else if (ProductData.productList.get(i).getTypeCode().compareTo(typeCode) == 0
					&& ProductData.productList.get(i).getProductId() != productId) {
				if (typeCode == "1") {
					ProductData.productList.get(i).setTypeName("TV");
				} else if (typeCode == "2") {
					ProductData.productList.get(i).setTypeName("Latop");
				} else if (typeCode == "3") {
					ProductData.productList.get(i).setTypeName("May in");
				} else if (typeCode == "4") {
					ProductData.productList.get(i).setTypeName("Dien thoai");
				} else if (typeCode == "5") {
					ProductData.productList.get(i).setTypeName("IPad");
				}

				System.out.println(" NHAP  MA SAN PHAM: ");
				Scanner input3 = new Scanner(System.in);
				productId = input3.nextInt();
				System.out.println("TEN SAN PHAM: ");
				Scanner input4 = new Scanner(System.in);
				productName = input4.nextLine();
				System.out.println("GIA SAN PHAM: ");
				Scanner input5 = new Scanner(System.in);
				price = input5.nextInt();
				System.out.println("CHI TIET SAN PHAM: ");
				Scanner input6 = new Scanner(System.in);
				productDetailt = input6.nextLine();
				ProductData.productList.add(new Product(typeCode, ProductData.productList.get(i).getTypeName(),
						productId, productName, price, "Con", productDetailt, quantity));
				break;
			} else if (ProductData.productList.get(i).getTypeCode().compareTo(typeCode) != 0) {
				System.out.println("MA LOAI: ");
				Scanner input7 = new Scanner(System.in);
				typeCode = input7.nextLine();

				System.out.println("TEN LOAI: ");
				Scanner input8 = new Scanner(System.in);
				typeName = input8.nextLine();

				System.out.println(" NHAP  MA SAN PHAM: ");
				Scanner input9 = new Scanner(System.in);
				productId = input9.nextInt();
				System.out.println("TEN SAN PHAM: ");
				Scanner input10 = new Scanner(System.in);
				productName = input10.nextLine();
				do {
					System.out.println("GIA SAN PHAM: ");
					Scanner input11 = new Scanner(System.in);
					price = input11.nextInt();
				} while (price <= 0);
				System.out.println("CHI TIET SAN PHAM: ");
				productDetailt = input.nextLine();
				int money = price * quantity;
				status = "Con";
				ProductData.productList.add(new Product(typeCode, typeName, productId, productName, price, status,
						productDetailt, quantity));
				System.out.println("Gia cua mat hang vua nhap la :  " + money);
				break;
			}

			break;
		}
		for (int i = 0; i < ProductData.productList.size(); i++) {
			System.out.println("*************THONG TIN SAN PHAM SAU KHI NHAP**************");
			System.out.println(ProductData.productList.get(i));
		}
	}

	public void sellProduct() {
		Scanner input = new Scanner(System.in);
		Run run = new Run();
		run.viewProduct();
		System.out.println("*************THONG TIN BAN SAN PHAM**************");
		System.out.println("MA LOAI: ");
		String typeCode = input.next();

		System.out.println(" NHAP  MA SAN PHAM: ");
		int productId = input.nextInt();

		int quantity;
		do {
			System.out.println("SO LUONG: ");
			quantity = input.nextInt();
		} while (quantity <= 0);
		System.out.println(" NHAP  MA KHACH HANG: ");
		int customerId = input.nextInt();
		for (int i = 0; i < CustomerData.CustomerList.size(); i++) {
			if (CustomerData.CustomerList.get(i).getId() == customerId) {
				System.out.println(" THONG TIN KHACH HANG: ");
				System.out.println(CustomerData.CustomerList.get(i));
				break;
			} else {
				Scanner input0 = new Scanner(System.in);
				System.out.println(" NHAP  TEN KHACH HANG: ");
				String customerName = input0.nextLine();
				System.out.println(" NHAP  SO DIEN THOAI KHACH HANG: ");
				Scanner input1 = new Scanner(System.in);
				String customerPhone = input1.nextLine();
				System.out.println(" NHAP  DIA CHI KHACH HANG: ");
				Scanner input2 = new Scanner(System.in);
				String customerAddress = input2.nextLine();
				System.out.println(" NHAP  TUOI KHACH HANG: ");
				Scanner input3 = new Scanner(System.in);
				int customerAge = input3.nextInt();
				CustomerData.CustomerList
						.add(new Customer(customerId, customerName, customerAddress, customerPhone, customerAge));
				System.out.println(" THONG TIN KHACH HANG: ");
				System.out.println(" Id : " + customerId);
				System.out.println(" Ten: " + customerName);
				System.out.println(" Dia chi: " + customerAddress);
				System.out.println(" So dien thoai: " + customerPhone);
				System.out.println(" Tuoi: " + customerAge);
				break;
			}
		}
		System.out.println("\n\n\t****THONG TIN CHI TIET CUA MOT SAN PHAM****");
		for (int i = 0; i < ProductData.productList.size(); i++) {
			if (ProductData.productList.get(i).getTypeCode().compareTo(typeCode) == 0
					&& ProductData.productList.get(i).getProductId() == productId) {
				if (ProductData.productList.get(i).getQuantity() == quantity) {
					ProductData.productList.get(i).setStatus("Het");
					ProductData.productList.get(i).setQuantity(0);
					System.out.println(
							"Gia cua mat hang vua ban la :  " + quantity * ProductData.productList.get(i).getPrice());
					System.out.println(ProductData.productList.get(i).toString());
				} else if (ProductData.productList.get(i).getQuantity() < quantity) {
					System.out.println("\n\t\tHang trong kho hien khong du vui long kiem tra lai\n\n");
					System.out.println(ProductData.productList.get(i).toString());
				} else {
					int qua = ProductData.productList.get(i).getQuantity() - quantity;
					ProductData.productList.get(i).setQuantity(qua);
					System.out.println(
							"Gia cua mat hang vua ban la :  " + quantity * ProductData.productList.get(i).getPrice());
					System.out.println(ProductData.productList.get(i).toString());
				}

			}

		}
	}
}