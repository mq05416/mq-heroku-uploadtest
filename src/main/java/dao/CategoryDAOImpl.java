package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Category;

public class CategoryDAOImpl implements CategoryDAO {

	public Integer addCategory(Category category) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();

		Transaction tx = null;
		Integer CategoryID = null;
		try {
			tx = session.beginTransaction();

			CategoryID = (Integer) session.save(category);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return CategoryID;
	}

	public List<Category> getList() {

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		List<Category> categoryList = null;
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			categoryList = session.createQuery("FROM Category").list();

			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return categoryList;
	}

	public void delCategory(int ma_the_loai) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Category category = (Category) session.get(Category.class,
					ma_the_loai);
			session.delete(category);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void updateCategory(Category category) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			session.update(category);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public Category getCategoryById(int ma_the_loai) {
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Category category = (Category) session.get(Category.class, ma_the_loai);
		return category;
	}

	public int getCategoryIdByName(String categoryName) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Category category = null;
		Query query = null;

		query = session.createQuery("from Category where categoryName=:name");
		query.setParameter("name", categoryName);
		category = (Category) query.uniqueResult();

		if (category != null)
			return category.getCategoryID();
		else return 0;
	}

	public String getCategoryName(Category category) {
		// TODO Auto-generated method stub

		return category.getCategoryName();
	}

	public static void main(String[] args) {

		//List<Category> categories = new ArrayList<Category>();

		CategoryDAOImpl categoryDAOImpl = new CategoryDAOImpl();
		/*
		 * categoryDAOImpl.addCategory(new Category(0, "Honda", "Honda 1",
		 * null)); categories = categoryDAOImpl.getList();
		 */
		/* System.out.println(categories); */

		/*System.out.println(categoryDAOImpl.getCategoryIdByName("motor sport ddd"));*/
		categoryDAOImpl.addCategory(new Category(0, "C1", "CD1"));
		
		
		

		/*
		 * for (Category category_: categories){
		 * System.out.println(category_.getCategoryID());
		 * System.out.println(category_.getCategoryName());
		 * System.out.println(category_.getCategoryDesc());
		 * 
		 * }
		 */

		/*
		 * SessionFactory sf = HibernateUtil.getSessionFactory(); Session
		 * session = sf.openSession(); session.beginTransaction();
		 * 
		 * Category category = new Category(0, "helu", "hule", new
		 * ArrayList<Product>());
		 * 
		 * session.save(category);
		 * 
		 * Product p1 = new Product("gs", "gg", "gg", 12.1, category); Product
		 * p2 = new Product("gg", "dah", "hh", 122.2, category);
		 * 
		 * List<Product> productsList = new ArrayList<Product>();
		 * productsList.add(p1); productsList.add(p2);
		 * category.setProducts(productsList);
		 * 
		 * session.save(category);
		 * 
		 * session.getTransaction().commit(); session.close();
		 */

		/*
		 * SessionFactory sf = HibernateUtil.getSessionFactory(); Session
		 * session = sf.openSession(); CategoryDAOImpl categoryDAOImpl = new
		 * CategoryDAOImpl();
		 * 
		 * Category category = new Category(0, "vidu1", "vidu2", null); Category
		 * category = new Category(0, "hsdf", "dsg", null);
		 * 
		 * 
		 * Product p1 = new Product(0, "sdag", "gdg", "ghg", 123, category);
		 * Product p2 = new Product(1, "sdag", "gdg", "ghg", 133, category);
		 * Set<Product> productsList = new HashSet<Product>();
		 * productsList.add(p1); productsList.add(p2);
		 * 
		 * category.setProducts(productsList);
		 * 
		 * categoryDAOImpl.addCategory(category);
		 * 
		 * Set<Product> products = new HashSet<Product>();
		 * products.add(product1); products.add(product2);
		 * products.add(product3);
		 * 
		 * category.setProducts(products);
		 * 
		 * categoryDAOImpl.addCategory(category);
		 * 
		 * products.add(product4);
		 * 
		 * 
		 * category = categoryDAOImpl.getCategoryById(1);
		 * System.out.println(category); category.setProducts(products);
		 * System.out.println(category);
		 */
		/* categoryDAOImpl.addCategory(category); */

		// categoryDAOImpl.addCategory(new Category(0, "lll", "uuu", products));

		// categoryDAOImpl.addCategory(new Category(0, "abc", "ddd"));
		// System.out.println(categoryDAOImpl.getList());
		// categoryDAOImpl.delCategory(3);
		// categoryDAOImpl.updateCategory(new Category(12, "Luan", "mom"));
		// System.out.println(categoryDAOImpl.getCategoryById(2));
		// categoryDAOImpl.updateCategory(new Category(4, "Luan nguyen",
		// "nluan", null));
	}

}
