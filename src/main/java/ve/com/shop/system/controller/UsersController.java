package ve.com.shop.system.controller;

import org.springframework.web.bind.annotation.SessionAttributes;
import ve.com.shop.system.model.Users;
import ve.com.shop.system.services.ProductService;
import ve.com.shop.system.services.ProductServiceImpl;
import ve.com.shop.system.services.UserService;
import ve.com.shop.system.services.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes({"user"})
public class UsersController {
    private UserService userService = new UserServiceImpl();
    private static Users user = new Users();

    @RequestMapping(value = "/login.tek", method = RequestMethod.GET)
    public ModelAndView initializeUser() {
        System.out.println("View - Initializer user.");
        return new ModelAndView("login" , "users", new Users());
    }

    @RequestMapping(value = "/main.tek", method = RequestMethod.POST)
    public ModelAndView checkUser(@ModelAttribute("users") Users user) {
        boolean temp = false;
        System.out.println("View - Check user.");
        temp = userService.searchUser(user);

        if("".equals(user.getUsername())||"".equals(user.getPassword())){
            return new ModelAndView("login" , "message", "Debe de llenar los campos: Correo y Clave");
        }else if(temp){
            UsersController.user.setUsername(user.getUsername());
            UsersController.user.setPassword(user.getPassword());
            ProductService productService = new ProductServiceImpl();
            ModelAndView model = new ModelAndView("shop" , "listProducts", productService.getProducts());
            model.addObject("message","Usuario");
            model.addObject("user", user);
            return  model;
        }else{
            return new ModelAndView("login" , "message", "Usuario Incorrecto");
        }
    }

}
