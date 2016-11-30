package struts2;


import java.util.List;

import model.Category;
import model.User;

import com.opensymphony.xwork2.ActionSupport;

import dao.CategoryDAOImpl;
import dao.ProductDAOImpl;



public class AdminAction extends ActionSupport {

	/**
	 * 
	 */


	
	private List<Category> categories;

	public String category_view() {

		CategoryDAOImpl categoryDAOImpl = new CategoryDAOImpl();
		

		categories = categoryDAOImpl.getList();

		return SUCCESS;
	}
	
	public String admin_view(){
		return SUCCESS;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	

	

	/*
	 * private String addToCart(Product product) { for (Cart item : carts) { if
	 * (item.getProduct().getMa_san_pham() == product.getMa_san_pham()) {
	 * item.setQuantity(item.getQuantity() + 1); return "cart"; } } Cart cart =
	 * new Cart(); cart.setProduct(product); cart.setQuantity(1);
	 * carts.add(cart); return "cart"; }
	 */

	

}
