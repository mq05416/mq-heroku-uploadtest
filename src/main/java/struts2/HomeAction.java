package struts2;

import java.util.List;
import java.util.Set;

import model.Category;
import model.Product;

import com.opensymphony.xwork2.ActionSupport;

import dao.CategoryDAOImpl;
import dao.ProductDAOImpl;

public class HomeAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Category> categories;
	private int categoryId;
	private List<Product> products;

	public String execute() {
		System.out.println("Vo execute - HomeAction");

		CategoryDAOImpl categoryDAOImpl = new CategoryDAOImpl();
		ProductDAOImpl productDAOImpl = new ProductDAOImpl();

		

		System.out.println(categories);
		System.out.println(products);
		System.out.println("Luan mom");
		
		System.out.println("CategoryID: " + categoryId);
		
		categories = categoryDAOImpl.getList();
		
/*		for (Category category_: categories){
			System.out.println(category_.getCategoryID());
			System.out.println(category_.getCategoryName());
			System.out.println(category_.getCategoryDesc());
			
		}*/
		//System.out.println(categories);
		System.out.println(products);
		System.out.println("Luan mom");
		
		System.out.println("CategoryID: " + categoryId);
	

		/*if (categoryId != 0)
			products = productDAOImpl.getListByCategory(categoryId);*/
		
		return SUCCESS;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
