package data;

import java.util.ArrayList;
import java.util.List;
import model.Product;

public class ProductData {
	public static List<Product> productList = new ArrayList<>();

	public static void productData() {

		Product product1 = new Product("1", "TV", 1, "LG", 10000000, "Con", "Cong nghe nhat ban, sieu mong", 200);
		productList.add(product1);
		Product product2 = new Product("1", "TV", 2, "SAMSUNG", 25000000, "Con", "Man hinh cong", 50);
		productList.add(product2);
		Product product3 = new Product("1", "TV", 3, "ASANZO", 20000000, "Con", "Dinh cao Nhat Ban", 25);
		productList.add(product3);
		Product product4 = new Product("2", "Latop", 1, "HP", 15000000, "Con", "New", 10);
		productList.add(product4);
		Product product5 = new Product("2", "Latop", 2, "SAMSUNG", 21000000, "Con", "New", 20);
		productList.add(product5);
		Product product6 = new Product("2", "Latop", 3, "ASUS", 25000000, "Con", "New", 12);
		productList.add(product6);
		Product product7 = new Product("2", "Latop", 4, "DELL", 28000000, "Con", "New", 6);
		productList.add(product7);
		Product product8 = new Product("3", "May in", 1, "JJJV", 10000000, "Con", "New", 5);
		productList.add(product8);
		Product product9 = new Product("3", "May in", 2, "ASF", 9000000, "Con", "New", 9);
		productList.add(product9);
		Product product10 = new Product("3", "May in", 3, "CCH", 9500000, "Con", "New", 2);
		productList.add(product10);
		Product product11 = new Product("3", "May in", 4, "GG", 20000000, "Con", "New", 2);
		productList.add(product11);
		Product product12 = new Product("4", "Dien thoai", 1, "SAMSUNG", 5000000, "Con", "New", 23);
		productList.add(product12);
		Product product13 = new Product("4", "Dien thoai", 2, "IPHONE", 15000000, "Con", "New", 12);
		productList.add(product13);
		Product product14 = new Product("4", "Dien thoai", 3, "OPPO", 25000000, "Con", "New", 14);
		productList.add(product14);
		Product product15 = new Product("4", "Dien thoai", 4, "HPHONE", 29000000, "Con", "New", 16);
		productList.add(product15);
		Product product16 = new Product("5", "IPad", 1, "SAMSUNG", 50000000, "Con", "New", 12);
		productList.add(product16);
		Product product17 = new Product("5", "IPad", 2, "IPAD", 55000000, "Con", "Man hinh gap", 18);
		productList.add(product17);
		Product product18 = new Product("5", "IPad", 3, "ASUS", 30000000, "Con", "New", 6);
		productList.add(product18);

	}
}
