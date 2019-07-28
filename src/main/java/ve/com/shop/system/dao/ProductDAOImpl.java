package ve.com.shop.system.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ve.com.shop.system.model.Products;
import ve.com.shop.system.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alejandro on 29/06/2017.
 */
public class ProductDAOImpl implements ProductDAO{

    public List<Products> getProducts() {
        List<Products> products = new ArrayList<Products>();
        Transaction temp = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            temp = session.beginTransaction();
            products = session.createQuery("FROM Products").list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }

        return products;
    }

}
