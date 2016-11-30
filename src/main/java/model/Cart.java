package model;

public class Cart {
	private Product product;
	private int quantity;

	public Cart() {
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	
	@Override
	public String toString() {
		return "Cart [product=" + product + ", quantity=" + quantity + "]";
	}

/*	public double getTotal() {
		double total = product.getGia_ban() * quantity;
		return total;
	}*/
}
