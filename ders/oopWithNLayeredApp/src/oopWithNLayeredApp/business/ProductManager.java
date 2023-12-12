package oopWithNLayeredApp.business;

import oopWithNLayeredApp.dataAcces.JdbcProductDao;
import oopWithNLayeredApp.dataAcces.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	
	private ProductDao productDao;
	

	public ProductManager(ProductDao productDao) {
		//productManager newlendiğinde bana bir productDao ver
		this.productDao = productDao;
	}


	public void add(Product product) throws Exception { //response -request paterni
		
		//iş kuralları yaıyoruz
		
		if(product.getUnitPrice()<10) {
			throw new Exception("fiyat 10dan küçük olamaz");
		}
		
		
		// ProductDao productDao = new JdbcProductDao();
		
		//bir katman başka bir katmanı kullanırken sadece interfaceinden erişim kurmalıdır
		
		productDao.add(product);
	}
	
	//sadece interface bağımlılığı var (gevşek bağlılık)
}
