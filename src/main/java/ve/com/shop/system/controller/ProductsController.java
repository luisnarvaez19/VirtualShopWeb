package ve.com.shop.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import ve.com.shop.system.model.Products;
import ve.com.shop.system.model.Users;
import ve.com.shop.system.services.ProductService;
import ve.com.shop.system.services.ProductServiceImpl;

@Controller
@SessionAttributes({"user"})
public class ProductsController {

    private ProductService productService = new ProductServiceImpl();

    @RequestMapping(value="/shop.tek", method = RequestMethod.POST)
    public ModelAndView getProducts(@ModelAttribute("user") Users user) {
        System.out.println("All products are displayed");
        ModelAndView model = new ModelAndView("shop" , "listProducts", productService.getProducts());
        model.addObject("message", "Usuario");
        model.addObject("user", user);
        return  model;
    }

}
