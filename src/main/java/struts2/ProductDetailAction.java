package struts2;

import java.util.List;

import model.Category;
import model.Product;

import com.opensymphony.xwork2.ActionSupport;

import dao.CategoryDAOImpl;
import dao.ProductDAOImpl;

public class ProductDetailAction extends ActionSupport {

	private Product product;
	private int ma_san_pham;
	private List<Category> categories;

	public String execute() {
		ProductDAOImpl productDAOImpl = new ProductDAOImpl();
		
		CategoryDAOImpl categoryDAOImpl = new CategoryDAOImpl();
		
		
		
		
		
		categories = categoryDAOImpl.getList();
		System.out.println("ma san pham: " + ma_san_pham);

	//	product = productDAOImpl.getProduct(ma_san_pham);
		return SUCCESS;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getMa_san_pham() {
		return ma_san_pham;
	}

	public void setMa_san_pham(int ma_san_pham) {
		this.ma_san_pham = ma_san_pham;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	
	
}
