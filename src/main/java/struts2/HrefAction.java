package struts2;

import java.util.List;

import model.Category;

import com.opensymphony.xwork2.ActionSupport;

import dao.CategoryDAOImpl;

public class HrefAction extends ActionSupport {
	
	private List<Category> categories;

	public String signup_view() {
		
		CategoryDAOImpl categoryDAOImpl = new CategoryDAOImpl();
		categories = categoryDAOImpl.getList();

		return SUCCESS;
	}

	public String login_view() {
		
		CategoryDAOImpl categoryDAOImpl = new CategoryDAOImpl();
		categories = categoryDAOImpl.getList();

		return SUCCESS;
	}

	

	public String admin_view() {

		return SUCCESS;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	/*
	 * public void validate() { if (username == null ||
	 * username.trim().equals("")) {
	 * addFieldError("username","The name is required"); } if
	 * (!password.equals(password2)) {
	 * addFieldError("password","Password doesn't match"); } }
	 */

	/*
	 * private String addToCart(Product product) { for (Cart item : carts) { if
	 * (item.getProduct().getMa_san_pham() == product.getMa_san_pham()) {
	 * item.setQuantity(item.getQuantity() + 1); return "cart"; } } Cart cart =
	 * new Cart(); cart.setProduct(product); cart.setQuantity(1);
	 * carts.add(cart); return "cart"; }
	 */

	

}
