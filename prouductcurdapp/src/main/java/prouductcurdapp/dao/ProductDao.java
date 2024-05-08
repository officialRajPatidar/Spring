package prouductcurdapp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import prouductcurdapp.model.Product;

@Component
public class ProductDao {
	@Autowired
 private HibernateTemplate hibenateTemplate;
	
	
	//for create
	@Transactional
	public void createProduct(Product product) {
		
		this.hibenateTemplate.saveOrUpdate(product);
		
	}
	
	//get all product
	public List <Product> getProducts() {
		List<Product> products = this.hibenateTemplate.loadAll(Product.class);
		return products;

	}
	
	//delete the single product
	@Transactional
	public void deleteProduct(int pid) {
		Product p = this.hibenateTemplate.load(Product.class,pid);
		this.hibenateTemplate.delete(p);
	}
	
	//get the single product
	public Product getProduct(int pid) {
		return this.hibenateTemplate.get(Product.class, pid);
	}
}
