package dao;



import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.User;

public class UserDAOImpl implements UserDAO {

	public String addUser(User u) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();

		Transaction tx = null;
		String username = null;
		try {
			tx = session.beginTransaction();

			username = (String) session.save(u);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return username;
	}

	
	public boolean checkExistUsername(String username){
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		if (((User)session.get(User.class, username))==null){
			return false;
		}
		else return true;
		
		
	}
	
	
	public boolean validateUsernameLogin(User user){
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		
		String hql = "FROM User WHERE username = '"+user.getUsername()+"' AND password = '"+user.getPassword()+"'";
		Query query = session.createQuery(hql);
		List<User> results = query.list();
		
		System.out.println(results.size());
		if (results.size()==0) return false;
		else return true;
		
		
	}
	
	public static void main(String[] args) {
		UserDAOImpl userDAOImpl = new UserDAOImpl();
		/*userDAOImpl.addUser(new User("luan", "123", "Luan Nguyen", "admin", "luannv.aptech2015@gmail.com"));*/
		
		System.out.println(userDAOImpl.validateUsernameLogin(new User("abcabc580", "123456", "sds", "user", "sdgf")));
		
		
	}

}
