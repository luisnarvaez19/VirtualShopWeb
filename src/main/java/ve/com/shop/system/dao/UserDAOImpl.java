package ve.com.shop.system.dao;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import ve.com.shop.system.model.Users;
import ve.com.shop.system.util.HibernateUtil;

public class UserDAOImpl implements UserDAO{
    public boolean searchUser(Users user) {

        boolean temp=false;
        Transaction trans = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            String queryString = "FROM Users WHERE username=:username AND password=:password";
            Query query = session.createQuery(queryString);
            query.setParameter("username", user.getUsername());
            query.setParameter("password", user.getPassword());
            temp = !(query.uniqueResult() ==(null));
        } catch (RuntimeException e) {
            temp = false;
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return temp;
    }
}
