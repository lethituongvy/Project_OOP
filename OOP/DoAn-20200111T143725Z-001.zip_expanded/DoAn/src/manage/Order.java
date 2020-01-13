package manage;

import java.util.Scanner;

import model.Product;
import userData.ProductData;

public class Order {

	public void inputProduct() {
		Scanner input = new Scanner(System.in);
		String typeCode, productName, status, productDetailt, typeName;
		int price = 0, quantity;
		System.out.println("DON NHAP HANG");

		System.out.println("NHAP THONG TIN ");

		System.out.println("MA LOAI: ");
		typeCode = input.next();
		System.out.println("MA SAN PHAM: ");
		int productId = input.nextInt();
		do {
			System.out.println("SO LUONG: ");
			quantity = input.nextInt();
		} while (quantity <= 0);

		for (int i = 0; i < ProductData.productList.size(); i++) {
			if (ProductData.productList.get(i).getTypeCode().compareTo(typeCode) == 0
					&& ProductData.productList.get(i).getProductId()== productId) {
				ProductData.productList.get(i).setQuantity(ProductData.productList.get(i).getQuantity() + quantity);
			} else if (ProductData.productList.get(i).getTypeCode().compareTo(typeCode) == 0
					&& ProductData.productList.get(i).getProductId()!=productId ) {
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
				productId = input.nextInt();
				System.out.println("TEN SAN PHAM: ");
				productName = input.next();
				System.out.println("GIA SAN PHAM: ");
				price = input.nextInt();
				System.out.println("CHI TIET SAN PHAM: ");
				productDetailt = input.next();
				ProductData.productList.add(new Product(typeCode, ProductData.productList.get(i).getTypeName(), productId,
						productName, price, "Con", productDetailt, quantity));

				break;
			} else if (ProductData.productList.get(i).getTypeCode().compareTo(typeCode) != 0) {
				System.out.println("MA LOAI: ");
				typeCode = input.next();

				System.out.println("TEN LOAI: ");
				typeName = input.next();

				System.out.println(" NHAP  MA SAN PHAM: ");
				productId = input.nextInt();
				System.out.println("TEN SAN PHAM: ");
				productName = input.next();
				System.out.println("GIA SAN PHAM: ");
				price = input.nextInt();
				System.out.println("CHI TIET SAN PHAM: ");
				productDetailt = input.next();
				int money = price * quantity;
				ProductData.productList.add(new Product(typeCode, typeName, productId, productName, price, "Con",
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
		for (int i = 0; i < ProductData.productList.size(); i++) {
			if (ProductData.productList.get(i).getTypeCode().compareTo(typeCode) == 0
					&& ProductData.productList.get(i).getProductId()==productId) {
				System.out.println("Gia cua mat hang vua ban la :  " + quantity * ProductData.productList.get(i).getPrice());

			}

		}
		for (int i = 0; i < ProductData.productList.size(); i++) {
			if (ProductData.productList.get(i).getTypeCode().compareTo(typeCode) == 0
					&& ProductData.productList.get(i).getProductId()==productId) {
				if (ProductData.productList.get(i).getQuantity() == quantity) {
					ProductData.productList.get(i).setStatus("Het");
					ProductData.productList.get(i).setQuantity(0);

				}

			}

		}

		System.out.println("\n\n\t****THONG TIN CHI TIET CUA MOT SAN PHAM****");

		for (int i = 0; i < ProductData.productList.size(); i++) {

			if (ProductData.productList.get(i).getTypeCode().compareTo(typeCode) == 0
					&& ProductData.productList.get(i).getProductId()==productId) {
				System.out.println(ProductData.productList.get(i).toString());
			}
		}
	}
}