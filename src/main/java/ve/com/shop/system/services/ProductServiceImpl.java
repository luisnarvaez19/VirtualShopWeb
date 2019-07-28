package ve.com.shop.system.services;

import ve.com.shop.system.dao.ProductDAO;
import ve.com.shop.system.dao.ProductDAOImpl;
import ve.com.shop.system.model.Products;
import java.util.List;

/**
 * Created by alejandro on 29/06/2017.
 */
public class ProductServiceImpl implements ProductService{
    private ProductDAO productDAO = new ProductDAOImpl();

    public List<Products> getProducts() {
        return productDAO.getProducts();
    }
}
