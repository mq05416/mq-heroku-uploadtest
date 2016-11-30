package struts2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.CategoryDAOImpl;
import dao.ProductDAOImpl;
import model.Cart;
import model.Category;
import model.Product;

public class CartAction extends ActionSupport implements SessionAware{

	private int productID;
	
	private List<Cart> carts;
	private List<Category> categories;
	
	private Map<String, Object> sessionMap;
	
	
	
	
	
	public CartAction() {
	}

	
	public CartAction(int productID, List<Cart> carts,
			List<Category> categories, Map<String, Object> sessionMap) {
		this.productID = productID;
		this.carts = carts;
		this.categories = categories;
		this.sessionMap = sessionMap;
	}


	public String execute() {
		
		ProductDAOImpl productDAOImpl = new ProductDAOImpl();
		Product product = productDAOImpl.getProductById(productID);
	
		// check if the userName is already stored in the session
        if (sessionMap.containsKey("cartsSession")) {
            carts = (ArrayList<Cart>)sessionMap.get("cartsSession");
            addToCart(product);
        }else{
        	carts = new ArrayList<Cart>();
        	addToCart(product);
        	sessionMap.put("cartsSession", carts);
        }
		
		
		
		
		
		
		System.out.println("Cart---------------");
		for (Cart item: carts){
			System.out.println(item.getProduct().getProductName());
			System.out.println(item.getQuantity());
		}
		
		
		CategoryDAOImpl categoryDAOImpl = new CategoryDAOImpl();
		categories = categoryDAOImpl.getList();
		
		
		
		return SUCCESS;
	}
	
	private String addToCart(Product product) {
		
		for (Cart item : carts) {
			if (item.getProduct().getProductID() == product.getProductID()) {
				item.setQuantity(item.getQuantity() + 1);
				return "cart";
			}
		}
		Cart cart = new Cart();
		cart.setProduct(product);
		cart.setQuantity(1);
		carts.add(cart);
		return "cart";
	}

	
	
	
	public List<Cart> getCarts() {
		return carts;
	}

	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	
	public void setSession(Map<String, Object> sessionMap) {
        this.sessionMap = sessionMap;
    }
	
	
}
