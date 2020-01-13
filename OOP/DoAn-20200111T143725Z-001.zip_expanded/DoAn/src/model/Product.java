package model;

import java.util.ArrayList;

public class Product {
	protected String typeCode;
	protected String typeName;
	protected int productId;
	protected String productName;
	protected int price;
	protected String status;
	protected String productDetailt;
	protected int quantity;

	ArrayList<Product> product = new ArrayList<Product>();

	public Product() {

	}

	public Product(String typeCode, String typeName) {
		this.typeCode = typeCode;
		this.typeName = typeName;
	}

	public Product(String typeCode, String typeName, int productId, String productName, int price, String status,
			String productDetailt, int quantity) {

		this.typeCode = typeCode;
		this.typeName = typeName;
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.status = status;
		this.productDetailt = productDetailt;
		this.quantity = quantity;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public String getTypeName() {
		return typeName;
	}

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public int getPrice() {
		return price;
	}

	public String getStatus() {
		return status;
	}

	public String getProductDetail() {
		return productDetailt;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductDetail(String productDetail) {
		this.productDetailt = productDetail;
	}

	public void setPrice(int price) {
		this.price = price;

	}

	public void setStatus(String status) {

		this.status = status;

	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String toString() {
		return "Ma loai: " + typeCode + "\n" + "Ten loai: " + typeName + "\n" + "Ma san pham: " + productId + "\n"
				+ "Ten san pham: " + productName + "\n" + "Gia: " + price + "\n" + "Tinh trang: " + status + "\n"
				+ "Chi tiet san pham: " + productDetailt + "\n" + "So luong: " + quantity + "\n";
	}
}
