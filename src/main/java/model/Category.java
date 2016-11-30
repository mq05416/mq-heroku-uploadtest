package model;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "CATEGORY")
public class Category {
	
	@Id
	@GeneratedValue
	@Column(name = "CATEGORY_ID")
	private int categoryID;
	
	@Column(name = "CATEGORY_NAME")
	private String categoryName;
	
	@Column(name = "CATEGORY_DESC")
	private String categoryDesc;
	
	@OneToMany(mappedBy = "category")
	private List<Product> products;
	public Category() {
	}
	public Category(int categoryID, String categoryName, String categoryDesc) {
		this.categoryID = categoryID;
		this.categoryName = categoryName;
		this.categoryDesc = categoryDesc;
		
	}
	public int getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryDesc() {
		return categoryDesc;
	}
	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Category [categoryID=" + categoryID + ", categoryName="
				+ categoryName + ", categoryDesc=" + categoryDesc
				+ ", products=" + products + "]";
	}
		

}
