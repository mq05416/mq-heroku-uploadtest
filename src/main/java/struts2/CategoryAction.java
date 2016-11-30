package struts2;

import java.util.List;
import java.util.Set;

import model.Category;
import model.Product;

import com.opensymphony.xwork2.ActionSupport;

import dao.CategoryDAOImpl;
import dao.ProductDAOImpl;

public class CategoryAction extends ActionSupport {

	private String tentheloai;
	private String mota;
	private List<Category> categories;
	private int ma_the_loai;
	private Category category;

	
	public String execute(){
		CategoryDAOImpl categoryDAOImpl = new CategoryDAOImpl();
		
		categories = categoryDAOImpl.getList();
		return SUCCESS;
				
	}
	
	public String delete(){
		CategoryDAOImpl categoryDAOImpl = new CategoryDAOImpl();
		
		categoryDAOImpl.delCategory(ma_the_loai);
		categories = categoryDAOImpl.getList();
		return SUCCESS;
				
	}
	
	public String edit_view(){
		CategoryDAOImpl categoryDAOImpl = new CategoryDAOImpl();
		category = categoryDAOImpl.getCategoryById(ma_the_loai);
		
		System.out.println(category.getCategoryID());
		System.out.println(category.getCategoryName());
		System.out.println(category.getCategoryDesc());
		
		
		categories = categoryDAOImpl.getList();
		
		return SUCCESS;
				
	}
	
	public String editcategory(){
		CategoryDAOImpl categoryDAOImpl = new CategoryDAOImpl();
		
		System.out.println(ma_the_loai+"\n"+tentheloai+"\n"+mota);
		
		categoryDAOImpl.updateCategory(new Category(ma_the_loai, tentheloai, mota));
		categories = categoryDAOImpl.getList();
		return SUCCESS;
	}
	
	public String add() {
		CategoryDAOImpl categoryDAOImpl = new CategoryDAOImpl();
		categoryDAOImpl.addCategory(new Category(0, tentheloai, mota));
		categories = categoryDAOImpl.getList();
		
		return SUCCESS;
	}

	public String getTentheloai() {
		return tentheloai;
	}

	public void setTentheloai(String tentheloai) {
		this.tentheloai = tentheloai;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public int getMa_the_loai() {
		return ma_the_loai;
	}

	public void setMa_the_loai(int ma_the_loai) {
		this.ma_the_loai = ma_the_loai;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	

}
