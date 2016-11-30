package dao;

import java.util.List;
import java.util.Set;

import model.Category;
import model.Product;

public interface ProductDAO {
	// them san pham moi
	public Integer addProduct(Product p);

	

	// hien thi danh sach san pham
	public List<Product> getList();

	
	public Product getProductById(int productId);
	

	

	// xoa san pham dua vao id
	public void delProduct(int ma_san_pham);
	
	public void delProduct(Product product);
	
	
	public List<Product> getListByCategory(int categoryId);
	
	
	public List<Product> getProductListByCategory (Category category);



	void updateProduct(Product product);

}
