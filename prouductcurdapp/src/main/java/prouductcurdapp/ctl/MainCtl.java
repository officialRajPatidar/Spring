package prouductcurdapp.ctl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import prouductcurdapp.dao.ProductDao;
import prouductcurdapp.model.Product;

@Controller
public class MainCtl {

	@Autowired
	private ProductDao productDao;
	
	@RequestMapping("/")
	public String home(Model m ) {
		List <Product>  products=productDao.getProducts();
		
		m.addAttribute("product",products);
		return "index";
	}
	
	//show page to add product
	@RequestMapping("/add-product")
	public String  addProduct( Model m) {
		m.addAttribute("title", "Add Product");
		
		return "add_product_from";
	}
	
	//handle add product form
	@RequestMapping(value = "/handle-product",method = RequestMethod.POST)
	public RedirectView handleproduct(@ModelAttribute Product product ,HttpServletRequest request) {
		
		System.out.println(product);
		productDao.createProduct(product);
		RedirectView rdv = new RedirectView();
		rdv.setUrl(request.getContextPath()+"/");
		return rdv;
	}
	//delte handler
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int productId ,HttpServletRequest request) {
		this.productDao.deleteProduct(productId);
		RedirectView rdv = new RedirectView();
		rdv.setUrl(request.getContextPath()+"/");
		return rdv;
	}
	
	@RequestMapping("/update/{productId}")
	public String  updateForm(@PathVariable("productId") int pId ,Model model)  {
		Product product = this.productDao.getProduct(pId);
		model.addAttribute("product", product);
		return "update_form";
	}
}
