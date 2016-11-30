package dao;


import java.util.Set;



import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;






import model.Category;
import model.Product;

public class ProductDAOImpl implements ProductDAO {
	public Integer addProduct(Product p) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();

		Transaction tx = null;
		Integer productID = null;
		try {
			tx = session.beginTransaction();

			productID = (Integer) session.save(p);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return productID;
	}

	public List<Product> getList() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		List<Product> productList = null;
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			productList = session.createQuery("FROM Product").list();

			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return productList;
	}

	public void delProduct(int ma_san_pham) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Product product = (Product) session.get(Product.class, ma_san_pham);
			session.delete(product);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	public void delProduct(Product product) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Product product1 = (Product) session.get(Product.class, product.getProductID());
			session.delete(product1);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	
	public List<Product> getListByCategory(int categoryId){
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Category category = (Category) session.get(Category.class, categoryId);
		List<Product> productList = category.getProducts();
		return productList;
	}
	public void updateProduct(Product product) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			session.update(product);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	
	
	public List<Product> getProductListByCategory (Category category){
		
		
		List<Product> productList = category.getProducts();
		return productList;
	}

	
	public Product getProductById(int productId){
		// TODO Auto-generated method stub
				SessionFactory sf = HibernateUtil.getSessionFactory();
				Session session = sf.openSession();
				Product product = (Product) session.get(Product.class, productId);
				return product;
	}
	
	public static void main(String[] args) {
	//	 Product product = new Product(0, 0, "hello", "a", 1234, "sadgs"); 
		ProductDAOImpl productDAOImpl = new ProductDAOImpl();
	//	 productDAOImpl.addProduct(product); 
		/* System.out.println(productDAOImpl.getList()); */
		/*System.out.println(productDAOImpl.getListByCategory(1));*/
		CategoryDAOImpl categoryDAOImpl = new CategoryDAOImpl();
		
		Category category = categoryDAOImpl.getCategoryById(1);
		/*categoryDAOImpl.addCategory(new Category(0, "ludeprrai", "ludeptrai1", null));
		System.out.println(categoryDAOImpl.getList());*/
		
		productDAOImpl.addProduct(new Product("Name1", "Description1", "Image1", 123, category));
		//System.out.println(productDAOImpl.getProductListByCategory(category));

	}

}
