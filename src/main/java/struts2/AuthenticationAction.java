package struts2;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.interceptor.validation.SkipValidation;

import model.Category;
import model.User;

import com.opensymphony.xwork2.ActionSupport;

import dao.CategoryDAOImpl;
import dao.UserDAOImpl;

public class AuthenticationAction extends ActionSupport implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6306700453212514075L;

	private Map<String, Object> sessionMap;
	private String fullname;
	private String username;
	private String email;
	private String password;
	private String password2;

	private List<Category> categories;

	private UserDAOImpl userDAOImpl = new UserDAOImpl();

	public String register() {
		System.out.println("Luan dep trai");

		User user = new User(username, password, fullname, "user", email);

		userDAOImpl.addUser(user);
		CategoryDAOImpl categoryDAOImpl = new CategoryDAOImpl();
		categories = categoryDAOImpl.getList();

		return SUCCESS;
	}

	@SkipValidation
	public String login() {
		User loggedUserName = null;
		CategoryDAOImpl categoryDAOImpl = new CategoryDAOImpl();
		categories = categoryDAOImpl.getList();
		// check if the userName is already stored in the session
		if (sessionMap.containsKey("userName")) {
			loggedUserName = (User) sessionMap.get("userName");
		}

		User user = new User(username, password, fullname, "user", email);

		if (userDAOImpl.validateUsernameLogin(user)) {
			// add userName to the session
			sessionMap.put("userName", user);
			return SUCCESS;
		} else
			return ERROR;
	}

	@SkipValidation
	public String signout() {
		// remove userName from the session
		if (sessionMap.containsKey("userName")) {
			sessionMap.remove("userName");
		}
		return SUCCESS;
	}

	public void validate() {
		System.out.println("Validating");

		if (username == null || username.trim().equals("")) {
			addFieldError("username", "The name is required");
			System.out.println("The name is required");
		}

		if (password.equals("")) {
			addFieldError("password", "Password is empty");
			System.out.println("Password is empty");
		}
		if (!password.equals(password2)) {
			addFieldError("password", "Password doesn't match");
			System.out.println("Password doesn't match");
		}
		if (userDAOImpl.checkExistUsername(username)) {
			addFieldError("username",
					"Username exists, please use another username!");
			System.out.println("Username exists, please use another username!");
		}
		System.out.println("Luan mom Validating");
	}

	/*
	 * private String addToCart(Product product) { for (Cart item : carts) { if
	 * (item.getProduct().getMa_san_pham() == product.getMa_san_pham()) {
	 * item.setQuantity(item.getQuantity() + 1); return "cart"; } } Cart cart =
	 * new Cart(); cart.setProduct(product); cart.setQuantity(1);
	 * carts.add(cart); return "cart"; }
	 */

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public Map<String, Object> getSessionMap() {
		return sessionMap;
	}

	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.sessionMap = arg0;

	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

}
