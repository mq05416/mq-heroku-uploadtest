package dao;

import java.util.List;

import javax.persistence.Id;

import model.Category;

public interface CategoryDAO {
	// them danh muc moi
	public Integer addCategory(Category c);

	// xoa danh muc
	public void delCategory(int ma_the_loai);

	// danh sach
	public List<Category> getList();

	// danh sách danh mục bằng ma_danh_muc
/*	public Category getCategory(int ma_the_loai);*/

	// cap nhat danh muc
	public void updateCategory(Category category);

	// lay id tu ten danh muc
/*	public int getId(String category_name);*/
	// get entity by id
	public Category getCategoryById(int ma_the_loai);
	
	public String getCategoryName (Category category);

}
