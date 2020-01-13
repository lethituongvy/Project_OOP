package userData;

import java.util.ArrayList;
import java.util.List;
import model.Product;

public class ProductData {
	public static List<Product> productList = new ArrayList<>();

	public static void productData() {
		int productCode1 = (productList.size() > 0) ? (productList.size() + 1) : 1;
		Product product1 = new Product("1", "TV", productCode1, "LG", 10000000, "Con", "Cong nghe nhat ban, sieu mong", 200);
		productList.add(product1);
		int productCode2 = (productList.size() > 0) ? (productList.size() + 1) : 1;
		Product product2 = new Product("1", "TV", productCode2, "SAMSUNG", 25000000, "Con", "Man hinh cong", 50);
		productList.add(product2);
		int productCode3 = (productList.size() > 0) ? (productList.size() + 1) : 1;
		Product product3 =new Product("1", "TV", productCode3, "ASANZO", 20000000, "Con", "Dinh cao Nhat Ban", 25);
		productList.add(product3);
		int productCode4 = (productList.size() > 0) ? (productList.size() + 1) : 1;
		Product product4 =new Product("2", "Latop", productCode4, "HP", 15000000, "Con", "New", 10);
		productList.add(product4);
		int productCode5 = (productList.size() > 0) ? (productList.size() + 1) : 1;
		Product product5 =new Product("2", "Latop", productCode5, "SAMSUNG", 21000000, "Con", "New", 20);
		productList.add(product5);
		int productCode6 = (productList.size() > 0) ? (productList.size() + 1) : 1;
		Product product6 =new Product("2", "Latop", productCode6, "ASUS", 25000000, "Con", "New", 12);
		productList.add(product6);
		int productCode7 = (productList.size() > 0) ? (productList.size() + 1) : 1;
		Product product7 =new Product("2", "Latop", productCode7, "DELL", 28000000, "Con", "New", 6);
		productList.add(product7);
		int productCode8 = (productList.size() > 0) ? (productList.size() + 1) : 1;
		Product product8 =new Product("3", "May in", productCode8, "JJJV", 10000000, "Con", "New", 5);
		productList.add(product8);
		int productCode9 = (productList.size() > 0) ? (productList.size() + 1) : 1;
		Product product9 =new Product("3", "May in", productCode9, "ASF", 9000000, "Con", "New", 9);
		productList.add(product9);
		int productCode10 = (productList.size() > 0) ? (productList.size() + 1) : 1;
		Product product10 =new Product("3", "May in", productCode10, "CCH", 9500000, "Con", "New", 2);
		productList.add(product10);
		int productCode11 = (productList.size() > 0) ? (productList.size() + 1) : 1;
		Product product11 =new Product("3", "May in", productCode11, "GG", 20000000, "Con", "New", 2);
		productList.add(product11);
		int productCode12 = (productList.size() > 0) ? (productList.size() + 1) : 1;
		Product product12 =new Product("4", "Dien thoai", productCode12, "SAMSUNG", 5000000, "Con", "New", 23);
		productList.add(product12);
		int productCode13 = (productList.size() > 0) ? (productList.size() + 1) : 1;
		Product product13 =new Product("4", "Dien thoai", productCode13, "IPHONE", 15000000, "Con", "New", 12);
		productList.add(product13);
		int productCode14 = (productList.size() > 0) ? (productList.size() + 1) : 1;
		Product product14 =new Product("4", "Dien thoai",productCode14, "OPPO", 25000000, "Con", "New", 14);
		productList.add(product14);
		int productCode15 = (productList.size() > 0) ? (productList.size() + 1) : 1;
		Product product15 =new Product("4", "Dien thoai", productCode15, "HPHONE", 29000000, "Con", "New", 16);
		productList.add(product15);
		int productCode16 = (productList.size() > 0) ? (productList.size() + 1) : 1;
		Product product16 =new Product("5", "IPad", productCode16, "SAMSUNG", 50000000, "Con", "New", 12);
		productList.add(product16);
		int productCode17 = (productList.size() > 0) ? (productList.size() + 1) : 1;
		Product product17 =new Product("5", "IPad", productCode17, "IPAD", 55000000, "Con", "Man hinh gap", 18);
		productList.add(product17);
		int productCode18 = (productList.size() > 0) ? (productList.size() + 1) : 1;
		Product product18 =new Product("5", "IPad",productCode18, "ASUS", 30000000, "Con", "New", 6);
		productList.add(product18);

	}
}
