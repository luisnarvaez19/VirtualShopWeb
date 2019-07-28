package ve.com.shop.system.services;

import ve.com.shop.system.dao.UserDAO;
import ve.com.shop.system.dao.UserDAOImpl;
import ve.com.shop.system.model.Users;

public class UserServiceImpl implements UserService{
    private UserDAO userDAO=new UserDAOImpl();

    public boolean searchUser(Users user) {
        return userDAO.searchUser(user);
    }

}
